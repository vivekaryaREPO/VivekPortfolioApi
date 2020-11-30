package com.example.VivekPortfolioApi.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class AboutMe {
	
	@Id
	private int id;
	private String aboutType;
	
	@Lob
	private String  aboutValue;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAboutType() {
		return aboutType;
	}
	public String getAboutValue() {
		return aboutValue;
	}
	public void setAboutValue(String aboutValue) {
		this.aboutValue = aboutValue;
	}
	public void setAboutType(String aboutType) {
		this.aboutType = aboutType;
	}



}
