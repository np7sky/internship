package com.km.web.model;

/**
 * @author tcn 空幕  email:1623092203@qq.com time:2016年5月20日上午10:20:06
 */
public class RoleBindModel
{
	private String name;	
	private Long[] authorityIds;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Long[] getAuthorityIds()
	{
		return authorityIds;
	}
	public void setAuthorityIds(Long[] authorityIds)
	{
		this.authorityIds = authorityIds;
	}
	
	
}
