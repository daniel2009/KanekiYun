package com.vsbm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vsbm.entity.Message;

@RepositoryRestResource(collectionResourceRel = "messages", path = "messages")
public interface MessageRepository extends MongoRepository<Message, String>{

}
