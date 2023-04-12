package com.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sr;

	public String setAllStudentDeatils(List<Student> s) {
		sr.saveAll(s);
		return "All Student Data Saved Successfully";
	}

	public List<Student> getAllStudentDetails() {

		return sr.findAll();
	}

	public String deleteById(int id) {
		sr.deleteById(id);
		return "Given Id Details SuccessFully Deleted";
	}

	public String setAge(int id, int age) {
		List<Student> findAll = sr.findAll();
		for (Student s : findAll) {
			int sid = s.getId();
			if (sid == id) {

				s.setAge(age);
				sr.save(s);
			}
		}
		return "Age Changed SuccessFully";
	}

}
