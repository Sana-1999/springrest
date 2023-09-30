package com.springrest.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.entity.Courses;


@Service
public class CourseserviceImpl implements Coursesrevice {
	
	
	List<Courses> list;
	
	public CourseserviceImpl() {
		
		list = new ArrayList<>();
		list.add(new Courses(145,"java core course","this course contain basics of java"));
		list.add(new Courses(234,"spring boot","spring boot course"));
	}
		
	
	
    @Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
		
		Courses  c = null;
		for(Courses course:list)
		{
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		
		return c;
	}



	@Override
	public Courses addCourses(Courses courses) {
		// TODO Auto-generated method stub
		list.add(courses);
		return courses;
	}






	



	



	


	
}
