package com.km.common.bean;

/**
 * 验证用户的前端封装数据体
 * 
 * @author tcn 空幕 email:1623092203@qq.com time:2016年5月19日下午5:02:33
 */
public class UserAuth
{
	private Long pkuid;
	private String name;
	private String username;
	private UserRole userRole;

	public UserAuth(Long pkuid, String name, String username)
	{
		this.pkuid = pkuid;
		this.name = name;
		this.username = username;
	}

	public Long getPkuid()
	{
		return pkuid;
	}

	public void setPkuid(Long pkuid)
	{
		this.pkuid = pkuid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public UserRole getUserRole()
	{
		return userRole;
	}

	public void setUserRole(UserRole userRole)
	{
		this.userRole = userRole;
	}

}
