package com.studentmanagement.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.studentmanagement.entity.Student;
import com.studentmanagement.repository.StudentRepository;
import com.studentmanagement.service.StudentService;

// defined the function which is used to handle this application 

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student) ;
	}


	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
