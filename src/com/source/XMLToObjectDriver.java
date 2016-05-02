package com.source;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class XMLToObjectDriver {

	public static final String FILE_NAME="student.xml";
	
	public static void main(String[] args) throws JAXBException{
		Student stud = (Student)((JAXBContext.newInstance(Student.class)).createUnmarshaller()).unmarshal(new File(FILE_NAME));
		System.out.println(stud);
		
	}
}
