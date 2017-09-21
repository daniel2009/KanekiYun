package com.vsbm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vsbm.entity.security.Role;


public interface RoleRepository extends MongoRepository<Role, String>{

}
