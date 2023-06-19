package com.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentmanagement.entity.Student;
import com.studentmanagement.repository.StudentRepository;

// Main class to handle all functionalities of this application

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		
		Student student1 = new Student("Shub" ,"Kumar" ,"shubham@gmail.com");
		studentRepository.save(student1);
//		
//		Student student2= new Student("example1" ,"last2" ,"shum@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Sham" ,"Kumr" ,"am@gmail.com");
//		studentRepository.save(student3);
//		
//		Student student4 = new Student("sam" ,"Kar" ,"ham@gmail.com");
//		studentRepository.save(student4);

		
		
		
	}
	
	

}
