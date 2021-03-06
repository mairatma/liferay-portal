/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.LayoutSetPrototype;

/**
 * The persistence interface for the layout set prototype service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LayoutSetPrototypePersistenceImpl
 * @see LayoutSetPrototypeUtil
 * @generated
 */
@ProviderType
public interface LayoutSetPrototypePersistence extends BasePersistence<LayoutSetPrototype> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LayoutSetPrototypeUtil} to access the layout set prototype persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the layout set prototypes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the layout set prototypes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @return the range of matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the layout set prototypes where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first layout set prototype in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first layout set prototype in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout set prototype, or <code>null</code> if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last layout set prototype in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last layout set prototype in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout set prototype, or <code>null</code> if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the layout set prototypes before and after the current layout set prototype in the ordered set where uuid = &#63;.
	*
	* @param layoutSetPrototypeId the primary key of the current layout set prototype
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a layout set prototype with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype[] findByUuid_PrevAndNext(
		long layoutSetPrototypeId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the layout set prototypes that the user has permission to view where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> filterFindByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the layout set prototypes that the user has permission to view where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @return the range of matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> filterFindByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the layout set prototypes that the user has permissions to view where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> filterFindByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the layout set prototypes before and after the current layout set prototype in the ordered set of layout set prototypes that the user has permission to view where uuid = &#63;.
	*
	* @param layoutSetPrototypeId the primary key of the current layout set prototype
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a layout set prototype with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype[] filterFindByUuid_PrevAndNext(
		long layoutSetPrototypeId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the layout set prototypes where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of layout set prototypes where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of layout set prototypes that the user has permission to view where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the layout set prototypes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the layout set prototypes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @return the range of matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the layout set prototypes where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first layout set prototype in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first layout set prototype in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout set prototype, or <code>null</code> if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last layout set prototype in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last layout set prototype in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout set prototype, or <code>null</code> if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the layout set prototypes before and after the current layout set prototype in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param layoutSetPrototypeId the primary key of the current layout set prototype
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a layout set prototype with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype[] findByUuid_C_PrevAndNext(
		long layoutSetPrototypeId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the layout set prototypes that the user has permission to view where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> filterFindByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the layout set prototypes that the user has permission to view where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @return the range of matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> filterFindByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the layout set prototypes that the user has permissions to view where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> filterFindByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the layout set prototypes before and after the current layout set prototype in the ordered set of layout set prototypes that the user has permission to view where uuid = &#63; and companyId = &#63;.
	*
	* @param layoutSetPrototypeId the primary key of the current layout set prototype
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a layout set prototype with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype[] filterFindByUuid_C_PrevAndNext(
		long layoutSetPrototypeId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the layout set prototypes where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of layout set prototypes where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of layout set prototypes that the user has permission to view where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the layout set prototypes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the layout set prototypes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @return the range of matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the layout set prototypes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first layout set prototype in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first layout set prototype in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout set prototype, or <code>null</code> if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last layout set prototype in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last layout set prototype in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout set prototype, or <code>null</code> if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the layout set prototypes before and after the current layout set prototype in the ordered set where companyId = &#63;.
	*
	* @param layoutSetPrototypeId the primary key of the current layout set prototype
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a layout set prototype with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype[] findByCompanyId_PrevAndNext(
		long layoutSetPrototypeId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the layout set prototypes that the user has permission to view where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> filterFindByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the layout set prototypes that the user has permission to view where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @return the range of matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> filterFindByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the layout set prototypes that the user has permissions to view where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> filterFindByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the layout set prototypes before and after the current layout set prototype in the ordered set of layout set prototypes that the user has permission to view where companyId = &#63;.
	*
	* @param layoutSetPrototypeId the primary key of the current layout set prototype
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a layout set prototype with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype[] filterFindByCompanyId_PrevAndNext(
		long layoutSetPrototypeId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the layout set prototypes where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of layout set prototypes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of layout set prototypes that the user has permission to view where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the layout set prototypes where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @return the matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findByC_A(
		long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the layout set prototypes where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param active the active
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @return the range of matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findByC_A(
		long companyId, boolean active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the layout set prototypes where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param active the active
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findByC_A(
		long companyId, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first layout set prototype in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype findByC_A_First(
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first layout set prototype in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching layout set prototype, or <code>null</code> if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype fetchByC_A_First(
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last layout set prototype in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype findByC_A_Last(
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last layout set prototype in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching layout set prototype, or <code>null</code> if a matching layout set prototype could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype fetchByC_A_Last(
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the layout set prototypes before and after the current layout set prototype in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param layoutSetPrototypeId the primary key of the current layout set prototype
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a layout set prototype with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype[] findByC_A_PrevAndNext(
		long layoutSetPrototypeId, long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the layout set prototypes that the user has permission to view where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @return the matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> filterFindByC_A(
		long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the layout set prototypes that the user has permission to view where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param active the active
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @return the range of matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> filterFindByC_A(
		long companyId, boolean active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the layout set prototypes that the user has permissions to view where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param active the active
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> filterFindByC_A(
		long companyId, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the layout set prototypes before and after the current layout set prototype in the ordered set of layout set prototypes that the user has permission to view where companyId = &#63; and active = &#63;.
	*
	* @param layoutSetPrototypeId the primary key of the current layout set prototype
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a layout set prototype with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype[] filterFindByC_A_PrevAndNext(
		long layoutSetPrototypeId, long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the layout set prototypes where companyId = &#63; and active = &#63; from the database.
	*
	* @param companyId the company ID
	* @param active the active
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_A(long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of layout set prototypes where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @return the number of matching layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_A(long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of layout set prototypes that the user has permission to view where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @return the number of matching layout set prototypes that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByC_A(long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the layout set prototype in the entity cache if it is enabled.
	*
	* @param layoutSetPrototype the layout set prototype
	*/
	public void cacheResult(
		com.liferay.portal.model.LayoutSetPrototype layoutSetPrototype);

	/**
	* Caches the layout set prototypes in the entity cache if it is enabled.
	*
	* @param layoutSetPrototypes the layout set prototypes
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.model.LayoutSetPrototype> layoutSetPrototypes);

	/**
	* Creates a new layout set prototype with the primary key. Does not add the layout set prototype to the database.
	*
	* @param layoutSetPrototypeId the primary key for the new layout set prototype
	* @return the new layout set prototype
	*/
	public com.liferay.portal.model.LayoutSetPrototype create(
		long layoutSetPrototypeId);

	/**
	* Removes the layout set prototype with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param layoutSetPrototypeId the primary key of the layout set prototype
	* @return the layout set prototype that was removed
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a layout set prototype with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype remove(
		long layoutSetPrototypeId)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.model.LayoutSetPrototype updateImpl(
		com.liferay.portal.model.LayoutSetPrototype layoutSetPrototype)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the layout set prototype with the primary key or throws a {@link com.liferay.portal.NoSuchLayoutSetPrototypeException} if it could not be found.
	*
	* @param layoutSetPrototypeId the primary key of the layout set prototype
	* @return the layout set prototype
	* @throws com.liferay.portal.NoSuchLayoutSetPrototypeException if a layout set prototype with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype findByPrimaryKey(
		long layoutSetPrototypeId)
		throws com.liferay.portal.NoSuchLayoutSetPrototypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the layout set prototype with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param layoutSetPrototypeId the primary key of the layout set prototype
	* @return the layout set prototype, or <code>null</code> if a layout set prototype with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.LayoutSetPrototype fetchByPrimaryKey(
		long layoutSetPrototypeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the layout set prototypes.
	*
	* @return the layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the layout set prototypes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @return the range of layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the layout set prototypes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of layout set prototypes
	* @param end the upper bound of the range of layout set prototypes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.LayoutSetPrototype> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the layout set prototypes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of layout set prototypes.
	*
	* @return the number of layout set prototypes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}