package com.th.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.th.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	public User findById(int id);

	public Optional<User> findByUserNameAndPassword(String userName, String password);
}
