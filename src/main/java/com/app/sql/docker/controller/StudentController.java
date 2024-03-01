package com.app.sql.docker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.sql.docker.entity.Student;
import com.app.sql.docker.repository.StudentRepository;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	StudentRepository repo;

	public StudentController(StudentRepository repo) {
		this.repo = repo;
	}
	
	@GetMapping("/findAll")
	public List<Student> getAllStudent(){
		return repo.findAll();
	}

	@PostMapping("/insert")
	public Student saveStudent(@RequestBody Student student) {
		return repo.save(student);
	}
}
