package com.sns.project.instagrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sns.project.instagrm.domain.User;

@Repository    
public interface InstagramRepository extends JpaRepository<User, Integer> {

	
	
}
