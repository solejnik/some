package com.oskar.training.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class SkillsGroupDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {

		return sessionFactory.getCurrentSession();
	}
	
	@Transactional
	public List<Group> getSkillGroups() {

		return getSession().createQuery("from Group").list();
	}
	
	
}
