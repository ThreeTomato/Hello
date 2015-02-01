package com.gll.test.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.gll.test.entity.Course;
import com.gll.test.entity.Student;
import com.gll.test.service.CourseService;
import com.gll.test.service.impl.CourseServiceImpl;

@Controller
@RequestMapping("/course")
public class CourseAction {
	private Course course;
	@Resource
	private CourseService courseService = new CourseServiceImpl();

	@RequestMapping("/select")
	public void select() {
		List<Course> list = courseService.select();
		for (Course c : list) {
			System.out.println(c.getCname());
			for (Student s : c.getStudent()) {
				System.out.println(s.getSname());
			}
		}
	}

	@RequestMapping("/save")
	public ModelAndView save(Course course,HttpServletRequest request,
			HttpServletResponse response) {
		int i = courseService.sava(course);
		System.out.println(course.getCname()+">>>>>>>>>>>>>"+ i);
		ModelAndView m = new ModelAndView();
		m.setViewName("succes");
		m.getModel().put("cname", course.getCname());
		return m;
	}

	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}


}
