package com.fda.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fda.project.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
