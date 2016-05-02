package com.source;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class ObjectToSchemaDriver {

	public static void main(String[] args) throws IOException, JAXBException{
		(JAXBContext.newInstance(Student.class)).generateSchema(new TestSchemaOutputResolver());
	}
}
