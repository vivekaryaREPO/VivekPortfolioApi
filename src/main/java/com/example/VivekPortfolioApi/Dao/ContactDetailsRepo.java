package com.example.VivekPortfolioApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.VivekPortfolioApi.Model.ContactDetails;

public interface ContactDetailsRepo extends JpaRepository<ContactDetails,Integer> {

}
