package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Engine eng;
	
	Car(){
		System.out.println("Object is created");
		eng.run();
	}
	
	
	
	

}
