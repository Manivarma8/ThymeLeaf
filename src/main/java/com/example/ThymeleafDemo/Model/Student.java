package com.example.ThymeleafDemo.Model;
import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

// @GeneratedValue(strategy = GenerationType.IDENTITY)
//@UuidGenerator
@Id
private String name1;
private String name2;

public Student( String name1, String name2) {
	
	this.name1 = name1;
	this.name2 = name2;	
}



public String getName1() {
	return name1;
}

public void setName1(String name1) {
	this.name1 = name1;
}

public String getName2() {
	return name2;
}

public void setName2(String name2) {
	this.name2 = name2;
}

public Student() {
}
@Override
public String toString() {
	return "Student [ name1=" + name1 +  ", name2=" + name2 + "]";
}
}
