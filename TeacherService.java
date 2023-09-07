package com.school.service;
	

	import com.school.dao.Teacherdao;
	import com.school.dto.Teacher;

	public class TeacherService {
	Teacherdao teacherdao=new Teacherdao();
	public Teacher saveTeacher(Teacher teacher) {
		return teacherdao.saveTeacher(teacher);
	}
	}

