package com.gll.test.dao;

import java.util.List;

import com.gll.test.entity.Course;


public interface CourseDao {
	public List<Course> select();

	public int save(Course c);
}
