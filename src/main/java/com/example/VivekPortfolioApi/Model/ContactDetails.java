package com.example.VivekPortfolioApi.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactDetails {
	@Id
	private int id;
	private String contactDetailsType;
	private String contactDetailsValue;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContactDetailsType() {
		return contactDetailsType;
	}
	public void setContactDetailsType(String contactDetailsType) {
		this.contactDetailsType = contactDetailsType;
	}
	public String getContactDetailsValue() {
		return contactDetailsValue;
	}
	public void setContactDetailsValue(String contactDetailsValue) {
		this.contactDetailsValue = contactDetailsValue;
	}

}
