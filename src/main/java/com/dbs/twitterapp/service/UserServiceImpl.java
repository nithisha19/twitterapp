package com.dbs.twitterapp.service;

import java.util.List;

import com.dbs.twitterapp.model.User;
import com.dbs.twitterapp.repository.UserRepository;

public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> listAll() {
		return this.userRepository.findAll();
	}

	@Override
	public User findById(long userId) {
		return this.userRepository.findById(userId).get();
	}

	@Override
	public void deleteUser(long userId) {
		 this.userRepository.delete(this.userRepository.findById(userId).get());
		
	}

}
