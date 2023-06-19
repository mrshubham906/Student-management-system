package com.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagement.entity.Student;

// this interface extends JpaRepository where jpaRepository have some methods to handle data from the server
public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
