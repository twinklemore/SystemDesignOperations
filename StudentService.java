package com.school.service;

import com.school.dao.Studentdao;
import com.school.dto.Student;

public class StudentService {
Studentdao studentdao=new Studentdao();
public Student saveStudent(Student student) {
	return studentdao.saveStudent(student);
}
}
