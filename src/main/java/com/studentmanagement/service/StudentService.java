package com.studentmanagement.service;

import java.util.List;

// Initilize some user defined function to handle the application

import com.studentmanagement.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
	
	

}
