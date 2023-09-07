package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentController {
public static void main(String[] args) {
	Student student=new Student();
	student.setId(1);
	student.setName("xyz");
	student.setEmail("xyz@mail.com");
	
	StudentService studentservice=new StudentService();
	Student s=studentservice.saveStudent(student);
	if(s!=null) {
		System.out.println(s.getId()+ "saved successfully");
	}
	
}
}
