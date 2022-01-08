package com.example.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SpringBootConfigApplication {


	/*
        Type checking works for @Value annotation. You have property of type integer but in properties file if you have
        given the string value then there will be a compile time error.
     */
	@Value("${greeting : Hi}")
	private String greeting;

	@Value("${number.list}")
	private List<String> numberList;

	@Value("hard coded value")
	private String value;

	@Value("#{${KeyValues}}")
	private Map<String, String> keyValues;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigApplication.class, args);
	}

}
