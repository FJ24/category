package com.category.category;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CategoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryApplication.class, args);
		User user=new User();
		user.setFirstName("Mohammed");
		user.setLastName("Mussa");
		user.setEmmail("mohammed@gmail.com");
	}
public static void main(String arg[]){
	MainFrame myFrame=new MainFrame();

	}

}
