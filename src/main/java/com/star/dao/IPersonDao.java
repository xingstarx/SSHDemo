package com.star.dao;

import com.star.entity.PersonEntity;

import java.util.List;

public interface IPersonDao {
	
	/**
	 * 插入一条记录
	 * @param person
	 */
	public void save(PersonEntity person);
	
	/**
	 * 查询所有记录
	 * @return
	 */
	public List<PersonEntity> queryAll();
}
