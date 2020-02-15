package com.capg;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.model.Employee;

@SpringBootApplication
public class Employee1Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Object obj = context.getBean("emp");
		Employee employee = (Employee) obj;
		System.out.println(employee);

	}

}
