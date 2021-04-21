package com.leave.leave.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.leave.leave.model.User;
import com.leave.leave.repositary.UserRepositary;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepositary repository;

	@Override
	public User saveUser(User user) {
		
		return repository.save(user);
	}

	@Override
	public boolean validateUser(User user1, User user2) {
		if (user1.getUserName().equals(user2.getUserName())
				&& user1.getPassword().equals(user2.getPassword()))
			return true;
		return false;
		
	}

	@Override
	public Optional<User> getUserDetails(String userName) {
		
		return repository.findByUserName(userName);
	}

	@Override
	public User UpdatePassword(String password) {
		
		User user = new User(password);
		user.setPassword(password);
		return repository.save(user);
	}

	
	

}
