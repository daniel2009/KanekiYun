package com.vsbm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vsbm.entity.security.UserRole;

public interface UserRoleRepository extends MongoRepository<UserRole, String> {

}
