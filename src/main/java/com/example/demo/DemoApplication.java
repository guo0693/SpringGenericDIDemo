package com.example.demo;

import com.example.interfaces.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	Controller<String> stringController;

	@Autowired
	Controller<Long> longController;

	public void test() {
		System.out.println(stringController.process("123"));
		System.out.println(longController.process(123456l));
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
