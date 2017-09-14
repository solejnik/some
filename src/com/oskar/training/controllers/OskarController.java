package com.oskar.training.controllers;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oskar.training.dao.Skill;
import com.oskar.training.dao.Group;
import com.oskar.training.service.SkillService;
import com.oskar.training.service.SkillsGroupService;

@Controller
public class OskarController {
	
	
	@Autowired
	private SkillsGroupService skillsGroupService;
	
	
	@Autowired
	private SkillService skillService;
	
	
	@RequestMapping("/")
	public String showHomepage() {
		return "home";
	}
	
	@RequestMapping("/competenceScreen")
	public String showCompetenceScreen(Model model) {

		List<Group> skillsGroups = skillsGroupService.getSkillsGroups();
		model.addAttribute("groups", skillsGroups);

		return "competenceScreen";
	}
	

	@RequestMapping(value = "/showDetails/{skillsGroup}", method = RequestMethod.GET)
	public String acceptClaim(@PathVariable String skillsGroup, Model model) {

		//claimsService.accept(claimId);
		
		List<Skill> skillDetails = skillService.getSkillDetails(skillsGroup);
		model.addAttribute("skills", skillDetails);
		
		
		return "dashboardAccepted";
	}

}
