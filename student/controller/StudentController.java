package com.student.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.customException.AgeException;
import com.student.entity.FinalResult;
import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
@Autowired
StudentService ss;
@PostMapping("/setAllDetails")
public String setAllStudentDetails(@RequestBody List<Student> s) throws AgeException {
	
	return ss.setAllStudentDetails(s);
}
@GetMapping("/getAllDetails")
public List<Student> getAllStudentDetails(){
	
	return ss.getAllStudentDetails();
}
@PutMapping("/setAgeById/{id}/{age}")
public String setAge(@PathVariable int id,@PathVariable int age) {
	return ss.setAge(id,age);
	
}
@DeleteMapping("/deleteById/{id}")
public String deleteById(@PathVariable int id) {
	return ss.deleteById(id);
}
@GetMapping("/getResult")
public List<FinalResult> getResults(){
	
   List<FinalResult> results = ss.getResults();
  
return results;
}

}
