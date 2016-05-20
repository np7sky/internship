package com.km.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.km.bean.Organization;
import com.km.common.service.impl.TreeServiceImpl;
import com.km.dao.IOrganizationDao;
import com.km.service.IOrganizationService;

/**
 * @author tcn 空幕  email:1623092203@qq.com time:2016年5月20日上午8:24:13
 */
@Service
public class OrganizationServiceImpl extends TreeServiceImpl<Long, Organization, IOrganizationDao> implements IOrganizationService
{

	public OrganizationServiceImpl(@Qualifier("IOrganizationDao")IOrganizationDao baseDao)
	{
		super(baseDao);
	}

	

}