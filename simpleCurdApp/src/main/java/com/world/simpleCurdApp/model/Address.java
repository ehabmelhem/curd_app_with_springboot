package com.world.simpleCurdApp.model;

public class Address {
	private State state;
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
	private String city;
	private String street;
	private String zipcode;
	private boolean containsAnimals;
}
