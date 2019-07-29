package com.wyq.service;

import java.util.List;

import com.wyq.entity.User;

public interface UserService {

	public List<User>  findByUsername(String username);
	
}
