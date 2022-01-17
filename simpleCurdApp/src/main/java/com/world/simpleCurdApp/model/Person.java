package com.world.simpleCurdApp.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@Document(collection = "personCollection")
public class Person {
	@Id
    @NotBlank(message = "ID is mandatory")
	@Size(min=3, max=40)
	private String id;
	
    @NotBlank(message = "Name is mandatory")
	@Size(min=3, max=20)
	private String name;
    
    @NotNull(message = "age is mandatory")
    @Min(0)
    @Max(200)
	private int age;
    
    @NotNull(message = "Gender is mandatory")
	private Gender gender;
    
    @NotNull(message = "height is mandatory")
    @Min(0)
	private double height;
    
    @NotNull(message = "weight is mandatory")
    @Min(0)
	private double weight;
    
	private Address address;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
