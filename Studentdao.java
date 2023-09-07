package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class Studentdao {
	HelperClass helperClass=new HelperClass();
	Connection connection=null;
	//to save a student data
	public Student saveStudent(Student student) {
		connection=helperClass.getconnection();
		String sql="INSERT INTO student VALUES(?,?,?)";
		try {
			//create statement
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//passed the values to delimiters/placeholders--->
			preparedStatement.setInt(1,student.getId());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3,student.getEmail());
			
			preparedStatement.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return student;

		}
	}
