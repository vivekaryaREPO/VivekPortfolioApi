package com.example.VivekPortfolioApi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.VivekPortfolioApi.Dal.PortfolioDetailsAccess;
import com.example.VivekPortfolioApi.Model.AboutMe;
import com.example.VivekPortfolioApi.Model.AllDetails;
import com.example.VivekPortfolioApi.Model.ContactDetails;
import com.example.VivekPortfolioApi.Model.Education;
import com.example.VivekPortfolioApi.Model.Projects;
import com.example.VivekPortfolioApi.Model.Skills;
import com.example.VivekPortfolioApi.Model.Technologies;

@RestController
public class PortfolioInfoController {
	
	@Autowired
	PortfolioDetailsAccess portFolioAccess;
				
	
	
	@GetMapping("/getAboutMe")
	public List<AboutMe> getAboutMe()
	{
		
		
		return this.portFolioAccess.getAboutMe();
	}
	
	
	
	@GetMapping("/contactDetails")
	public List<ContactDetails> contactDetails()
	{
		
		
		return this.portFolioAccess.getContactDetails();
	}
	
	
	
	@GetMapping("/getEducation")
	public List<Education> getEducation()
	{
		
		
		return this.portFolioAccess.getEducation();
	}
	
	
	@GetMapping("/getProjects")
	public List<Projects> getProjects()
	{
		
		
		return this.portFolioAccess.getProjects();
	}
	
	
	@GetMapping("/getSkills")
	public List<Skills> getSkills()
	{
		
		
		return this.portFolioAccess.getSkills();
	}
	
	
	@GetMapping("/getTechnologies")
	public List<Technologies> getTechnologies()
	{
		
		
		return this.portFolioAccess.getTechnologies();
	}
	
	
	

}
