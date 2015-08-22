package com.java.chapterTwo;

public class Student
{
	private String studentName;
	private int studentId;
	private int studentGrade;
	private String town;
	
	public Student()
	{
		this.studentName = Input.getString("Enter the Name: ");
		this.studentId = Input.getInteger("Enter the ID: ");
		this.studentGrade = Input.getInteger("Enter Grade Point Average: ");
		this.town = Input.getString("Enter the town: ");
	}

	public String getStudentName() {
		return studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public int getStudentGrade() {
		return studentGrade;
	}

	public String getTown() {
		return town;
	}
	
	
	
}
