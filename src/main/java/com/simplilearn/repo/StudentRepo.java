package com.simplilearn.repo;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
