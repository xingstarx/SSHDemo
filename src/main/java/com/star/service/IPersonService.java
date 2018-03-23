package com.star.service;

import com.star.entity.PersonEntity;

import java.util.List;

public interface IPersonService {
	
	/**
	 * 处理添加记录
	 */
	public void processSave(PersonEntity person);
	
	/**
	 * 处理查询所有记录
	 * @return
	 */
	public List<PersonEntity> processQueryAll();
}
