package com.codingninjas.EVotingSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingninjas.EVotingSystem.entities.User;
import com.codingninjas.EVotingSystem.repositories.UserReository;


@Service
public class UserService {
	
	@Autowired
	UserReository userrepository;

	public void addUser(User user) {
		userrepository.save(user);
		
	}

	public List<User> getAllUsers() {
		return userrepository.findAll();
	}

}
