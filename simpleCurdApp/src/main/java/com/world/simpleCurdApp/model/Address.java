package com.world.simpleCurdApp.model;

import java.lang.annotation.Target;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Address {
    @NotNull(message = "state is mandatory")
	@Pattern(regexp = "Israel")
	private State state;
    
    @NotBlank(message = "Cit is mandatory")
	@Size(min=3, max=20)
    private String city;
    
    @NotBlank(message = "Street is mandatory")
	@Size(min=3, max=50)
    private String street;
	
    @NotBlank(message = "zipcode is mandatory")
	@Pattern(regexp = "[0-9]+")
	private String zipcode;
    
    @NotBlank(message = "containsAnimals is mandatory")    
	private boolean containsAnimals;
    
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public boolean isContainsAnimals() {
		return containsAnimals;
	}
	public void setContainsAnimals(boolean containsAnimals) {
		this.containsAnimals = containsAnimals;
	}

}
