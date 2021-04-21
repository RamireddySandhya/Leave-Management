package com.leave.leave.service;

import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.leave.leave.model.User;
@Component
@Service
public interface UserService {
	public User saveUser(User user);
	public boolean validateUser(User user1,User user2);
	public Optional<User> getUserDetails(String userName);
	public User UpdatePassword(String password);
}
