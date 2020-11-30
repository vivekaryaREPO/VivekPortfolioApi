package com.example.VivekPortfolioApi.Model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.example.VivekPortfolioApi.Model.AboutMe;
import com.example.VivekPortfolioApi.Model.ContactDetails;
import com.example.VivekPortfolioApi.Model.Education;
import com.example.VivekPortfolioApi.Model.Skills;
import com.example.VivekPortfolioApi.Model.Technologies;
public class AllDetails {
	
	private List<AboutMe> aboutMe;
	private List<ContactDetails> contactDetails;
	private List<Education> education;
	private List<Skills> skills;
	private List<Technologies> technologies;
	
	
	
	public List<AboutMe> getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(List<AboutMe> aboutMe) {
		this.aboutMe = aboutMe;
	}
	public List<ContactDetails> getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(List<ContactDetails> contactDetails) {
		this.contactDetails = contactDetails;
	}
	public List<Education> getEducation() {
		return education;
	}
	public void setEducation(List<Education> education) {
		this.education = education;
	}
	public List<Skills> getSkills() {
		return skills;
	}
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	public List<Technologies> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<Technologies> technologies) {
		this.technologies = technologies;
	}

}
