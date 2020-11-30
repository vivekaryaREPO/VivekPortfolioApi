package com.example.VivekPortfolioApi.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Education {
	
	@Id
	private int id;
	private String institution;
	private String Course;
	private String grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}

}
