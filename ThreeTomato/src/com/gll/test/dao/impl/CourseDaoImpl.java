package com.gll.test.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.gll.test.dao.CourseDao;
import com.gll.test.entity.Course;
import com.gll.test.util.BaseDaoImpl;


@Repository("courseDao")
public class CourseDaoImpl extends BaseDaoImpl<Course> implements CourseDao{

	public List<Course> select() {
		// TODO Auto-generated method stub
		return this.select("com.gll.entity.Course.stuAndCou",null);
	}

	public int save(Course c) {
		// TODO Auto-generated method stub
		return this.save("com.gll.entity.Course.courseInsert",c);
	}
	

}
