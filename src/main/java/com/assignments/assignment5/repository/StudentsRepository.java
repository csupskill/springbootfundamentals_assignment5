package com.assignments.assignment5.repository;

import com.assignments.assignment5.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student, Integer> {
}
