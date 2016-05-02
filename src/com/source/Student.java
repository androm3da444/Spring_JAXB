package com.source;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Student")

public class Student {

	private String name;
	
	public Student()
	{
		
	}
	
	public Student(String name){
		this.name = name;
	}

	@XmlElement(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return name;
	}
	
}
