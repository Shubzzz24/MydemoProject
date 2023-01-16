package com.example.demoprojects;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	
	     @RequestMapping("/courses")
         public List<Course> retriveAllCourses(){
        	 return Arrays.asList(
        			 new Course(1,"Learn Aws", "Shubham"),
        			 new Course(2,"Learn Spring Boot","Shubzz"),
        			 new Course(3, "Learn Python", "Tush"),
					 new Course(4,"Learn Azure","Ram")
        			 );
         }
	 
}
