package com.simranjeet.singh.learn.home.ui.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simranjeet.singh.learn.home.io.entity.UserEntity;
import com.simranjeet.singh.learn.home.io.repository.UsersRepository;
import com.simranjeet.singh.learn.home.ui.service.UserService;
import com.simranjeet.singh.learn.home.ui.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersRepository  usersRepository;
	
	@Override
	public UserDto createdUser(UserDto user) {

		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		userEntity.setEncryptedPassword("test");
		userEntity.setUserId("testUserId");
		
		UserEntity storedUserDetails = usersRepository.save(userEntity);
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);

		
		return returnValue;
	}

}
