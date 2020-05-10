package com.demo.spring.bootbasic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.demo.spring.bootbasic.entity.Org;
import com.demo.spring.bootbasic.repo.OrgRepo;

@Service
public class OrgService {

	@Autowired
	private OrgRepo orgRepo;

	public List<Org> getOrgDetails() {

		List<Org> orgs = orgRepo.findAll();

		if (!CollectionUtils.isEmpty(orgs))
			return orgs;

		return null;
	}

	public Org addOrgData(Org data) {

		Org savedData = orgRepo.save(data);
		if (!StringUtils.isEmpty(savedData))
			return savedData;

		return null;
	}
}
