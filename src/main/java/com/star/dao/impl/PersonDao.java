package com.star.dao.impl;

import com.star.dao.IPersonDao;
import com.star.entity.PersonEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class PersonDao implements IPersonDao {
	private SessionFactory factory;
	
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void save(PersonEntity person) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		try {
			session.save(person);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally{
			session.close();
		}
		
		
	}

	@Override
	public List<PersonEntity> queryAll() {
		Session session = factory.openSession();
		session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<PersonEntity> personList = session.createQuery("from PersonEntity p").list();
		
		session.getTransaction().commit();
		session.close();
		
		return personList;
	}

}
