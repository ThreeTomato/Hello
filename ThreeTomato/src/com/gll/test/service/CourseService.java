package com.gll.test.service;

import java.util.List;

import com.gll.test.entity.Course;


public interface CourseService {
	/**
	 * 查询数据
	* @Title: select 
	* @Description: TODO
	* @return List<Course>    返回类型 
	* @throws
	 */
	public List<Course> select();
	/**
	 * 保存数据
	* @Title: sava 
	* @Description: TODO
	* @return int    返回类型 
	* @throws
	 */
	public int sava(Course c);
}
