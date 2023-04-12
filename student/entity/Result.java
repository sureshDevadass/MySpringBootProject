package com.student.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Result {
	@Id
	private int id;
	private int rollNumber;
	private String name;
	private int attendance;
	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	private int sem1Total;
	private int sem2Total;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSem1Total() {
		return sem1Total;
	}

	public void setSem1Total(int sem1Total) {
		this.sem1Total = sem1Total;
	}

	public int getSem2Total() {
		return sem2Total;
	}

	public void setSem2Total(int sem2Total) {
		this.sem2Total = sem2Total;
	}

}
