package com.springrest.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entity.Courses;
import com.springrest.service.Coursesrevice;

//rest - representational state transfer
@RestController
public class MyController {
	
	@Autowired
	private Coursesrevice coursesrevice;
	
	@GetMapping("/home")
	public String home() {
		return "welcome to courses application";
		
	}
	
	//get the courses
	
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		
		return this.coursesrevice.getCourses();
		
		
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.coursesrevice.getCourse(Long.parseLong(courseId));
	}

	
	@PostMapping( "/courses")
	public Courses addCourses(@RequestBody Courses courses) {
		
		return this.coursesrevice.addCourses(courses);
		
	}
	
	
	
	
	
}
