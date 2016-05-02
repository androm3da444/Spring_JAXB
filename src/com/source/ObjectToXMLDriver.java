package com.source;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXMLDriver {
	public static final String FILE_NAME="student.xml";
	
	public static void main(String[] args) throws JAXBException{
		Marshaller marshaller = JAXBContext.newInstance(Student.class).createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(new Student("Amit1"), new File(FILE_NAME));
	}
}
