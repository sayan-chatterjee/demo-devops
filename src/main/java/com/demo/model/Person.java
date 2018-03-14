package com.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Person")
public class Person {
    
	@Id
	private String id;
	private String name;
	private String qualification;
	
	
	
	public Person(String id, String name, String qualification) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
	}

	public Person() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
	
}
