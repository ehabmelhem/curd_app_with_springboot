package com.world.simpleCurdApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.world.simpleCurdApp.model.Person;
@Repository
public interface PersonReopsitory extends MongoRepository<Person,String> {

}
