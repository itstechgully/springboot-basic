package com.demo.spring.bootbasic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.bootbasic.entity.Employee;
import com.demo.spring.bootbasic.entity.Org;
import com.demo.spring.bootbasic.service.EmpService;
import com.demo.spring.bootbasic.service.OrgService;

@RestController
@RequestMapping("/org")
public class OrgController {

	@Autowired
	private OrgService orgService;

	@Autowired
	private EmpService empService;
	@RequestMapping(value = "/getallorgsdetails", method = RequestMethod.GET)
	public ResponseEntity<?> saveUser() throws Exception {
		return ResponseEntity.ok(orgService.getOrgDetails());
	}
	@RequestMapping(value = "/addemp", method = RequestMethod.POST)
	public ResponseEntity<?> addEmp(@RequestBody Employee emp) throws Exception {
		return ResponseEntity.ok(empService.addEmp(emp));
	}


	@RequestMapping(value = "/addorg", method = RequestMethod.POST)
	public ResponseEntity<?> addOrg(@RequestBody Org org) throws Exception {
		return ResponseEntity.ok(orgService.addOrgData(org));
	}

}
