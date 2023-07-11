package com.assignments.assignment4.repository;

import com.assignments.assignment4.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student, Integer> {
}
