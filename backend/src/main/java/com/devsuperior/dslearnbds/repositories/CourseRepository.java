package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
