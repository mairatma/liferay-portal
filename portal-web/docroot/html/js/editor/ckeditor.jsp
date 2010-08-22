<%
/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.URLCodec" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.util.TextFormatter" %>

<%
long plid = ParamUtil.getLong(request, "p_l_id");
String mainPath = ParamUtil.getString(request, "p_main_path");
String doAsUserId = ParamUtil.getString(request, "doAsUserId");
String initMethod =	ParamUtil.getString(request, "initMethod", DEFAULT_INIT_METHOD);
String onChangeMethod = ParamUtil.getString(request, "onChangeMethod");
String toolbarSet = ParamUtil.getString(request, "toolbarSet", "liferay");
String cssPath = ParamUtil.getString(request, "cssPath");
String cssClasses = ParamUtil.getString(request, "cssClasses");
%>

<html>

<head>
	<style type="text/css">
		table.cke_dialog {
			position: absolute !important;
		}
	</style>

	<script type="text/javascript" src="ckeditor/ckeditor.js"></script>

	<script type="text/javascript">
		function initCkArea() {
			var textArea = document.getElementById("CKEditor1");
			var ckEditor = CKEDITOR.instances.CKEditor1;

			textArea.value = parent.<%= HtmlUtil.escape(initMethod) %>();

			CKEDITOR.config.toolbar = '<%= TextFormatter.format(HtmlUtil.escape(toolbarSet), TextFormatter.M) %>';
			CKEDITOR.config.customConfig = '<%= request.getContextPath() %>/html/js/editor/ckeditor/ckconfig.jsp?p_l_id=<%= plid %>&p_main_path=<%= URLCodec.encodeURL(mainPath) %>&doAsUserId=<%= URLCodec.encodeURL(doAsUserId) %>&cssPath=<%= URLCodec.encodeURL(cssPath) %>&cssClasses=<%= URLCodec.encodeURL(cssClasses) %>';

			ckEditor.on(
				'instanceReady',
				function() {
					setInterval(
						function() {
							try {
								onChangeCallback();
							}
							catch(e) {
							}
						},
						300
					);
				}
			);
		}

		function getCkData() {
			var data = CKEDITOR.instances.CKEditor1.getData();

			if (CKEDITOR.env.gecko && (CKEDITOR.tools.trim(data) == '<br />')) {
				data = '';
			}

			return data;
		}

		function getHTML() {
			return getCkData();
		}

		function getText() {
			return getCkData();
		}

		function onChangeCallback() {

			<%
			if (Validator.isNotNull(onChangeMethod)) {
			%>

				var ckEditor = CKEDITOR.instances.CKEditor1;
				var dirty = ckEditor.checkDirty();

				if (dirty) {
					parent.<%= HtmlUtil.escape(onChangeMethod) %>(getText());

					ckEditor.resetDirty();
				}

			<%
			}
			%>

		}
	</script>
</head>

<body>

<textarea id="CKEditor1" name="CKEditor1"></textarea>

<script type="text/javascript">

	<%
	String connectorURL = URLCodec.encodeURL(mainPath + "/portal/fckeditor?p_l_id=" + plid + "&doAsUserId=" + URLCodec.encodeURL(doAsUserId));
	%>

	CKEDITOR.replace(
		'CKEditor1',
		{
			filebrowserBrowseUrl: '<%= request.getContextPath() %>/html/js/editor/ckeditor/editor/filemanager/browser/liferay/browser.html?Connector=<%= connectorURL %>',
			filebrowserUploadUrl: '<%= request.getContextPath() %>/html/js/editor/ckeditor/editor/filemanager/browser/liferay/frmupload.html?Connector=<%= connectorURL %>'
		}
	);

	initCkArea();
</script>

</body>

</html>

<%!
public static final String DEFAULT_INIT_METHOD = "initEditor";
%>