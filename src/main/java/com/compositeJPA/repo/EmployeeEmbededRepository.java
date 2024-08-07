package com.compositeJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.compositeJPA.Entity.EmployeeEmbedd;
import com.compositeJPA.Entity.EmployeeEmbedID;

@Repository
public interface EmployeeEmbededRepository extends JpaRepository<EmployeeEmbedd, EmployeeEmbedID>{

}
