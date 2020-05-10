package com.demo.spring.bootbasic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring.bootbasic.entity.Employee;

@Repository
public interface Emprepo extends JpaRepository<Employee, Integer> {

}
