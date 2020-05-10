package com.demo.spring.bootbasic.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPID", columnDefinition = "NUMBER", nullable = false)
	private int id;
	@Column(name = "EMPNAME")
	private String name;
	@Column(name = "SALARY")
	private String salary;
	@Column(name = "DESG")
	private String desgination;
	@Column(name="ORG_ID")
	private int org_ID;
	

	
	

	

	public int getOrg_ID() {
		return org_ID;
	}

	public void setOrg_ID(int org_ID) {
		this.org_ID = org_ID;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "JOINING_DATE")
	private Date joiningDate;

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDesgination() {
		return desgination;
	}

	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}

}
