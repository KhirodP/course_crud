package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entity.Course;

public interface CourseService {

	public List<Course> getCourse();
	
	public Course getCourse(long courseid);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deletCourse(long parseLong);
	

}
