package com.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.Result;
import com.student.repository.ResultRepository;

@Repository
public class ResultDao {

	@Autowired
	ResultRepository rr;

	public List<Result> getResultsDao() {

		 List<Result> resultsDao = rr.getResultsDao();
		 
		  return resultsDao;
	}
}
