package com.km.common.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * base实体
 * 
 * @author tcn 空幕 email:1623092203@qq.com time:2016年5月16日下午11:17:22
 */

public abstract class AbstratBaseEntity<PkUid extends Number>
{

	/**
	 * 主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pkuid")
	private PkUid pkuid;

	/**
	 * 标记实体是否审核 0false否 1true是
	 */
	@Column
	private boolean aduit = false;

	/**
	 * 名称
	 */
	@Column
	private String name;

	/**
	 * 创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	@org.hibernate.annotations.CreationTimestamp
	private Long createTime;

	/**
	 * 更新时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	@org.hibernate.annotations.UpdateTimestamp
	private Long updateTime;

	public PkUid getPkuid()
	{
		return pkuid;
	}

	public void setPkuid(PkUid pkuid)
	{
		this.pkuid = pkuid;
	}

	public boolean isAduit()
	{
		return aduit;
	}

	public void setAduit(boolean aduit)
	{
		this.aduit = aduit;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Long getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Long createTime)
	{
		this.createTime = createTime;
	}

	public Long getUpdateTime()
	{
		return updateTime;
	}

	public void setUpdateTime(Long updateTime)
	{
		this.updateTime = updateTime;
	}

}
