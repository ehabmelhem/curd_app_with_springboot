package com.world.simpleCurdApp.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Getter
@Setter
@ToString
@Document(collection = "personCollection")
public class Person {
	private String id;
	private String name;
	private int age;
	private Gender gender;
	private double height;
	private double weight;
	private Address address;
	
}
