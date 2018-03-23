package com.star.action;

import com.opensymphony.xwork2.ActionSupport;
import com.star.entity.PersonEntity;
import com.star.service.IPersonService;

import java.util.List;

public class PersonAction extends ActionSupport {
	private static final long serialVersionUID = 3688652545792174296L;
	
	private PersonEntity person;
	private IPersonService personService;
	private List<PersonEntity> personList;
	
	public List<PersonEntity> getPersonList() {
		return personList;
	}

	public void setPersonList(List<PersonEntity> personList) {
		this.personList = personList;
	}

	public void setPersonService(IPersonService personService) {
		this.personService = personService;
	}

	public PersonEntity getPerson() {
		return person;
	}

	public void setPerson(PersonEntity person) {
		this.person = person;
	}

	public String save_input() {
		return SUCCESS;
	}
	
	public String save() {
		if(person != null) {
			personService.processSave(person);
		}
		return SUCCESS;
	}
	
	public String queryAll() {
		personList = personService.processQueryAll();
		
		return SUCCESS;
	}
}
