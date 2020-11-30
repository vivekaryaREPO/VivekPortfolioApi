package com.example.VivekPortfolioApi.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Technologies {
	
	@Id
	private int id;
	private String technologyName;
	private String proficiencyType;
	private int proficiencyLevel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTechnologyName() {
		return technologyName;
	}
	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}
	public String getProficiencyType() {
		return proficiencyType;
	}
	public void setProficiencyType(String proficiencyType) {
		this.proficiencyType = proficiencyType;
	}
	public int getProficiencyLevel() {
		return proficiencyLevel;
	}
	public void setProficiencyLevel(int proficiencyLevel) {
		this.proficiencyLevel = proficiencyLevel;
	}
}
