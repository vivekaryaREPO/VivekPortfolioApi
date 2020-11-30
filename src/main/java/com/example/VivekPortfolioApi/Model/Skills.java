package com.example.VivekPortfolioApi.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Skills {
	
	@Id
	private int id;
	private String skillName;
	
	@Lob
	private String skillDetails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillDetails() {
		return skillDetails;
	}
	public void setSkillDetails(String skillDetails) {
		this.skillDetails = skillDetails;
	}


}
