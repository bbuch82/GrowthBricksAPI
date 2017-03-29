package de.bb.service;

import org.springframework.stereotype.Service;

import de.bb.model.Company;

@Service
public class CompanyService {

	public Company create() {
		return new Company();
	}
	
}
