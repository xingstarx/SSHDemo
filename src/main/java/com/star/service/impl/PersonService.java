package com.star.service.impl;

import com.star.dao.IPersonDao;
import com.star.entity.PersonEntity;
import com.star.service.IPersonService;

import java.util.List;

public class PersonService implements IPersonService {
	private IPersonDao personDao;
	
	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void processSave(PersonEntity person) {
		personDao.save(person);
	}

	@Override
	public List<PersonEntity> processQueryAll() {
		return personDao.queryAll();
	}

}
