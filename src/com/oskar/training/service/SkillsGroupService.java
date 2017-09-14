package com.oskar.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oskar.training.dao.Group;
import com.oskar.training.dao.SkillsGroupDao;


@Service
public class SkillsGroupService {
	
	
	@Autowired
	SkillsGroupDao skillsGroupDao;
	
	
	public List<Group> getSkillsGroups() {
		
		return skillsGroupDao.getSkillGroups();
		
	}

	
	
	
	
	
	
}
