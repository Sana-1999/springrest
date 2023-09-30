package com.springrest.service;

import java.util.List;

import com.springrest.entity.Courses;

public interface Coursesrevice {
	
	
	public List<Courses> getCourses();
	
	public Courses getCourse(long courseId);
	
	public Courses addCourses(Courses courses);
	
	
	
	
	

}
