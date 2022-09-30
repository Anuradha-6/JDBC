package com.student.manage;

public class Student {
	private int studentId;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	
	public Student(int studentId, String studentName, String studentPhone, String studentCity) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentPhone=studentPhone;
		this.studentCity=studentCity;
	}
	public Student(String studentName, String studentPhone, String studentCity) {
		super();
		this.studentName=studentName;
		this.studentPhone=studentPhone;
		this.studentCity=studentCity;
	}
	public Student() {
		super();
	}
	public int getId() {
		return studentId;
	}
	public String getName() {
		return studentName;
	}
	public String getPhone() {
		return studentPhone;
	}
	public String getCity() {
		return studentCity;
	}
	public void setId(int studentId) {
		this.studentId=studentId;
	}
	public void setName(String studentName) {
		this.studentName=studentName;
	}
	public void serPhone(String studentPhone) {
		this.studentPhone=studentPhone;
	}
	public void setCity(String studentCity) {
		this.studentCity=studentCity;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + "]";
	}
	
}
