package com.demo.spring.bootbasic.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "COMPANY")
public class Org {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "COMP_NAME")
	private String comp_Name;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="org_ID",referencedColumnName = "id")
	private List<Employee> emps;

	public String getComp_Name() {
		return comp_Name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@JsonIgnore
	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public void setComp_Name(String comp_Name) {
		this.comp_Name = comp_Name;
	}

}
