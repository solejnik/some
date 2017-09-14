package com.oskar.training.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class SkillDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {

		return sessionFactory.getCurrentSession();
	}

	@Transactional
	public List<Skill> getSkillDetails(String groupName) {

		String hql = "select a from Skill a join a.groups g where g.name = :groupName";
		// Query query = (Query) getSession().createQuery(hql).list();
		// query.setParameter("SG", skillsGroup);

		List list = getSession().createQuery(hql).setParameter("groupName", groupName).list();
		return list;
	}

}
