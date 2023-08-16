package com.vijay.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.vijay.dao.StudentDao;
import com.vijay.entity.Student;

public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDao studentDao;
	
	@Override
	public boolean saveStudent(Student std) {
		return studentDao.saveStudent(std);
	}

	@Override
	public Student getStudent(int id) {
		return studentDao.getStudent(id);
	}

	@Override
	public List<Student> getStudents() {
		return studentDao.getStudents();
	}

	@Override
	public boolean deleteStudent(int id) {
		return studentDao.deleteStudent(id);
	}

	@Override
	public Student updateStudent(Student std) {
		return studentDao.updateStudent(std);
	}

}
