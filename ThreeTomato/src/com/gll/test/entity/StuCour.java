package com.gll.test.entity;

public class StuCour {
	private Integer id;
	private Student stu;
	private Course cou;

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public Course getCou() {
		return cou;
	}

	public void setCou(Course cou) {
		this.cou = cou;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
