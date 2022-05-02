package com.springrest.springrest.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.service.CourseService;


@RestController
public class MyController {
		
		@Autowired
		private CourseService courseService;
		
		@GetMapping("/course")
		List<Course> getCourse()
		{
			return this.courseService.getCourse();
		}
		
		@GetMapping("/course/{courseid}")
		Course getCourse(@PathVariable String courseid)
		{
			return this .courseService.getCourse(Long.parseLong(courseid));
		}
		
		@PostMapping("/courses")
		public Course addCourse(@RequestBody Course course)
		{
			return this.courseService.addCourse(course);
		}
		
		@PutMapping("/course")
		public Course updateCourse(@RequestBody Course course) {
			return this.courseService.updateCourse(course);
		}
		
		@DeleteMapping("/course/{courseid}")
		public ResponseEntity<HttpStatus> deletCourse(@PathVariable String courseid)
		{
			try {
			this.courseService.deletCourse(Long.parseLong(courseid));
			return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(Exception e)
			{
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

}
