package com;

public class Person {
	
	private int id;
	private int age;
	private String gender;
	private String location;
	private String name;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	public void setLocation(String Location) {
		this.location = Location;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	@Override
	public String toString() {
		return "ID : "+id+"|| Name : "+name+"|| Age : "+age+"|| Location : "+location+"|| Gender : "+gender;
	}
}
