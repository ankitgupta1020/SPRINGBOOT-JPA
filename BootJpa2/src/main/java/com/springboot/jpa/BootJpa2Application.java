package com.springboot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.jpa.Repositiry.UserRepository;
import com.springboot.jpa.entites.User;

@SpringBootApplication
public class BootJpa2Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	=SpringApplication.run(BootJpa2Application.class, args);
	UserRepository repository=context.getBean(UserRepository.class);
	User user= new User();
	user.setAbout("Ankit Is Kabadi Ladka");
	user.setId(12345);
	user.setName("poorvi");
	
	User save = repository.save(user);
	System.out.println(save);
	}

}
