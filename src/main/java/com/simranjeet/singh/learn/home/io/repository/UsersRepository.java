package com.simranjeet.singh.learn.home.io.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simranjeet.singh.learn.home.io.entity.UserEntity;

@Repository
public interface UsersRepository extends CrudRepository<UserEntity, Long> {
	
	UserEntity findUserByEmail(String email);

}
