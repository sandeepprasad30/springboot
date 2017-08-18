package com.example.demo;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.example.Student;
import com.example.StudentService;


@SpringBootApplication
@ComponentScan(basePackageClasses = StudentService.class)
public class DemoApplication extends SpringBootServletInitializer{
	
	public static HashMap<Long,Student> hmStudent;
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		hmStudent=new HashMap<Long,Student>();
		 
	      Student one=new Student("John","math");
	      hmStudent.put(new Long(one.getId()),one);
        return application.sources(DemoApplication.class);
    }

	public static void main(String[] args) {
		hmStudent=new HashMap<Long,Student>();
		 
	      Student one=new Student("John","math");
	      hmStudent.put(new Long(one.getId()),one);
	      
	      SpringApplication.run(DemoApplication.class, args);
	      
	      Student two=new Student("Jane","history");
	      hmStudent.put(new Long(two.getId()),two);
	}
}
