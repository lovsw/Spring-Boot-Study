package com.wyq.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wyq.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public List<User>  findByUsername(String username);
}
