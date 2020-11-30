package com.example.VivekPortfolioApi.Dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.VivekPortfolioApi.Dao.AboutMeRepo;
import com.example.VivekPortfolioApi.Dao.ContactDetailsRepo;
import com.example.VivekPortfolioApi.Dao.EducationRepo;
import com.example.VivekPortfolioApi.Dao.ProjectsRepo;
import com.example.VivekPortfolioApi.Dao.SkillsRepo;
import com.example.VivekPortfolioApi.Dao.TechnologiesRepo;
import com.example.VivekPortfolioApi.Model.AboutMe;
import com.example.VivekPortfolioApi.Model.AllDetails;
import com.example.VivekPortfolioApi.Model.ContactDetails;
import com.example.VivekPortfolioApi.Model.Education;
import com.example.VivekPortfolioApi.Model.Projects;
import com.example.VivekPortfolioApi.Model.Skills;
import com.example.VivekPortfolioApi.Model.Technologies;

@Component
public class PortfolioDetailsAccess {
	
	@Autowired
	AboutMeRepo aboutMeRepo;
	
	@Autowired
	ContactDetailsRepo contactDetailsRepo;
	
	@Autowired
	EducationRepo educationRepo;
	
	@Autowired
	ProjectsRepo projectsRepo;
	
	@Autowired
	SkillsRepo skillsRepo;
	
	@Autowired
	TechnologiesRepo technologiesRepo;
	
	
	
	
	public List<AboutMe> getAboutMe()
	{
		return this.aboutMeRepo.findAll();
	}
	
	
	public List<ContactDetails> getContactDetails()
	{
		return this.contactDetailsRepo.findAll();
	}
	
	
	public List<Education> getEducation()
	{
		return this.educationRepo.findAll();
	}
	
	
	public List<Projects> getProjects()
	{
		return this.projectsRepo.findAll();
	}
	
	public List<Skills> getSkills()
	{
		return this.skillsRepo.findAll();
	}
	
	public List<Technologies> getTechnologies()
	{
		return this.technologiesRepo.findAll();
	}
	

	
	

}
