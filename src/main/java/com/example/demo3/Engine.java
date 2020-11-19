package com.example.demo3;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	Engine(){
		System.out.println("Object is created for engine");
	}
	
	public void run() {
		System.out.println("engine is running");
	}

}
