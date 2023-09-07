package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Student;
import com.school.dto.Teacher;

public class Teacherdao {
	HelperClass helperClass=new HelperClass();
	Connection connection=null;
	//to save a student data
	public Teacher saveTeacher(Teacher teacher) {
		connection=helperClass.getconnection();
		String sql="INSERT INTO teacher VALUES(?,?,?)";
		try {
			//create statement
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//passed the values to delimiters/placeholders--->
			preparedStatement.setInt(1,teacher.getId());
			preparedStatement.setString(2,teacher.getName());
			preparedStatement.setString(3,teacher.getEmail());
			
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
		return teacher;

		}
	
	}

