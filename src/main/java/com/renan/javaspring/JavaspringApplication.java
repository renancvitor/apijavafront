package com.renan.javaspring;

import com.renan.javaspring.principal.Principal;
import com.renan.javaspring.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaspringApplication.class, args);
	}
}
