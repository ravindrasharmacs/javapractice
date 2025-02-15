package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		
		List<String> strings = new ArrayList<>();
		strings.add("Hello");
		strings.add("World");
		strings.add("Apple");
		strings.add("Banana");
		strings.add("Orange");

		System.out.println("Original list:" + strings);

		Collections.sort(strings , (s1,s2) -> Integer.compare(s1.length(),s2.length()));
		System.out.println("Sorted list (by length):"+strings);

		Collections.sort(strings, (s1,s2) -> Integer.compare(s2.length() , s1.length()));

		System.out.println("Sorted list (by length in reverse order):"+strings);

	}
	}


