package com;

public class Person {
	
	private static final int id;
	private static final int Age;
	private static final string Gender;
	private static final string Location;
	private static final string Name;
	
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
	
	public string getGender() {
		return this.Gender;
	}
	
	public void setGender(string Gender) {
		this.Gender = Gender;
	}
	
	public string getLocation() {
		return this.Location;
	}
	
	public void setLocation(string Location) {
		this.Location = Location;
	}
	
	public string getName() {
		return this.Name;
	}
	
	public void setName(string Name) {
		this.Name = Name;
	}
	
	@Override
	public String toString() {
		return "ID : "+id+"|| Name : "+Name+"|| Age : "+Age+"|| Location : "+Location+"|| Gender : "+Gender;
	}
}
