package com.world.simpleCurdApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.world.simpleCurdApp.model.Person;

public interface PersonReopsitory extends MongoRepository<Person,String> {

}
