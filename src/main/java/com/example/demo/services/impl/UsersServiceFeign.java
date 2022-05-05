package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.client.feign.UsersRestFeign;
import com.example.demo.models.Users;
import com.example.demo.services.IUsersService;

@Service
public class UsersServiceFeign implements IUsersService {
	
	@Autowired
	private UsersRestFeign usersRestFeign;
	
	@Override
	public List<Users> getAllUser() {
		return usersRestFeign.getAllUsers();
	}
	
}
