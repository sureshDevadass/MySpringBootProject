package com.student.service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.customException.AgeException;
import com.student.dao.ResultDao;
import com.student.dao.StudentDao;
import com.student.entity.FinalResult;
import com.student.entity.Result;
import com.student.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;
	@Autowired
	ResultDao rd;
	
	public String setAllStudentDetails(List<Student> s) throws AgeException {

		List<Student> collect = s.stream().filter(x -> x.getAge() < 18).collect(Collectors.toList());
		if (collect.isEmpty()) {

			return sd.setAllStudentDeatils(s);
		} else {
			throw new AgeException();

		}

	}

	public List<Student> getAllStudentDetails() {

		return sd.getAllStudentDetails();
	}

	public String setAge(int id, int age) {
		return sd.setAge(id, age);
	}

	public String deleteById(int id) {

		return sd.deleteById(id);
	}

	public List<FinalResult> getResults() {

		List<Result> results = rd.getResultsDao();
		List<FinalResult> finalResults = new LinkedList<>();
		for (Result r : results) {
			FinalResult f = new FinalResult();
			f.setId(r.getId());
			f.setRollNumber(r.getRollNumber());
			f.setName(r.getName());
			f.setAttendance(r.getAttendance());
			f.setTotalMarks(r.getSem1Total()+r.getSem2Total());
			f.setPercentage((r.getSem1Total()+r.getSem2Total())/2);
			finalResults.add(f);
		}
		return finalResults;
	}

}
