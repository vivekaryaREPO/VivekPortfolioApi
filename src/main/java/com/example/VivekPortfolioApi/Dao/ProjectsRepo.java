package com.example.VivekPortfolioApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.VivekPortfolioApi.Model.Projects;

public interface ProjectsRepo extends JpaRepository<Projects,Integer> {

}
