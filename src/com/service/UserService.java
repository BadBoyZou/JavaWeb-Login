package com.service;

import java.util.List;

import com.domain.User;

public interface UserService {

	void regist(List<User> userList, User user);

	User login(List<User> userlList, User user);
	
}
