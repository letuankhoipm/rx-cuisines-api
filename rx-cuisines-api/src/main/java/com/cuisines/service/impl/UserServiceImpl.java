package com.cuisines.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cuisines.entity.User;
import com.cuisines.repository.UserRepository;
import com.cuisines.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {	
		return userRepository.findAll();
	}
}
