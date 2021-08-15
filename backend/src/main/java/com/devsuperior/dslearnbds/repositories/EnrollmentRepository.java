package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.entities.Enrollment;
import com.devsuperior.dslearnbds.entities.pk.EnrollmentPK;

@Repository
public interface 
EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK>{

}
