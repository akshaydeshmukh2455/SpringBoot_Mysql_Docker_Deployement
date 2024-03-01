package com.app.sql.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.sql.docker.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
