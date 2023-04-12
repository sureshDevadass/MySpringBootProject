package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.entity.Result;


public interface ResultRepository extends JpaRepository<Result, Integer> {
	
	@Query(value="select student.id,student.roll_Number,student.name,student.attendance,marksheet.sem1total,marksheet.sem2total from student inner join marksheet on student.id=marksheet.id " , nativeQuery = true)
	List<Result> getResultsDao();


}
