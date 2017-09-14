package com.oskar.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oskar.training.dao.Skill;
import com.oskar.training.dao.SkillDao;

@Service
public class SkillService {
	
	
	
	@Autowired
	SkillDao skillDao;
	
	
	public List<Skill> getSkillDetails(String skillsGroup) {
		
		return skillDao.getSkillDetails(skillsGroup);
		
	}

	
	
	
	
	
	
	

}
