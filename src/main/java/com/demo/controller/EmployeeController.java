package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Person;
import com.demo.repository.PersonRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/")
	public String greet(){
		return "Hello World!!";
	}
	
	@GetMapping("/me")
	public String greetMe(){
		return "Hello "
				+ "Sayan!!";
	}
	
	@GetMapping("/getAllPerson")
	public Page<Person> getPerson(){
		Page<Person> list = personRepository.findAll(PageRequest.of(0, 2));
		//System.out.println(personRepository.findAll());
		return list;
		
	}
	
	@PostMapping("/create")
	public Person create(){
		Person person = personRepository.save(new Person("1","rt","jk"));
		//System.out.println(personRepository.findAll());
		return person;
		
	}
	
}