package com.gomeshud.wsmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gomeshud.wsmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
