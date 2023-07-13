package com.fda.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fda.project.entity.Category;



public interface CategoryDao extends JpaRepository<Category,Integer> {

//    List<Category> getAllCategory();
}
