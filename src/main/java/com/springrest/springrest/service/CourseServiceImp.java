package com.springrest.springrest.service;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Course;


 @Service
public class CourseServiceImp implements CourseService{
	
	
	@Autowired
	private CourseDao courseDao;
	
	List<Course> list;
	
	CourseServiceImp()
	{
//		list=new ArrayList<>();
//		list.add(new Course(100,"java","its a simple language"));
//		list.add(new Course(100,"java","its a simple language")); 
	}
	
	
	
	@Override	
	public List<Course> getCourse()
		{
			//return list;
		return courseDao.findAll();
			
		}

	public Course getCourse(long courseid)
	{
//			Course c= null;
//			for(Course course:list)
//			{
//				if(course.getId()==courseid)
//				{
//					c=course;
//					break;
//				}
//			}
//		return c;
		return courseDao.getOne(courseid);
	}
	
	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
		 courseDao.save(course);
		 return course;
	}



	@Override
	public Course updateCourse(Course course) {
		/*list.forEach(e->{
			if(e.getId()==course.getId()) 
			{
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});*/
		
		Course courseAfterUpdate=courseDao.save(course);
		return null;
	}



	@Override
	public void deletCourse(long parseLong) {
			
		//list= this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course courseAfterDelet=courseDao.getOne(parseLong);
		courseDao.delete(courseAfterDelet);
		
	}
}
