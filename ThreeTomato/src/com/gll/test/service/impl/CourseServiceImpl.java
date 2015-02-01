package com.gll.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.gll.test.dao.CourseDao;
import com.gll.test.dao.impl.CourseDaoImpl;
import com.gll.test.entity.Course;
import com.gll.test.service.CourseService;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	@Resource
	private CourseDao courseDao = new CourseDaoImpl();

	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public List<Course> select() {
		// TODO Auto-generated method stub
		return courseDao.select();
	}

	public int sava(Course c) {
		// TODO Auto-generated method stub
		return courseDao.save(c);
	}

}
