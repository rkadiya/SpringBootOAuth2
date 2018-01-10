package com.gigy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gigy.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
}
