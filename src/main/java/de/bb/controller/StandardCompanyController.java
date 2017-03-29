package de.bb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.bb.model.Company;
import de.bb.service.CompanyService;

@RestController
public class StandardCompanyController {

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(path="/company/{id}")
	public Company getCompany(@PathVariable Integer id) {
		Company company = companyService.create();
		company.setName("Meine Firma " + id);
		return company;
	}
	
}
