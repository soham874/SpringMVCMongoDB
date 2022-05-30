package com;

public class Person {
	
	private int id;
	private int Age;
	private String Gender;
	private String Location;
	private String Name;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return this.Age;
	}
	
	public void setAge(int Age) {
		this.Age = Age;
	}
	
	public String getGender() {
		return this.Gender;
	}
	
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	
	public String getLocation() {
		return this.Location;
	}
	
	public void setLocation(String Location) {
		this.Location = Location;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	@Override
	public String toString() {
		return "ID : "+id+"|| Name : "+Name+"|| Age : "+Age+"|| Location : "+Location+"|| Gender : "+Gender;
	}
}
