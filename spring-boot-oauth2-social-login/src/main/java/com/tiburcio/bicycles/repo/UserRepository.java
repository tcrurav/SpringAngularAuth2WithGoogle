package com.tiburcio.bicycles.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiburcio.bicycles.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
	boolean existsByEmail(String email);
}
