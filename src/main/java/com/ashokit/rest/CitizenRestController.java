package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.Citizen;
import com.ashokit.exceptions.NoSSNFoundException;
import com.ashokit.service.CitizenManagementService;

@RestController
public class CitizenRestController {
	
	@Autowired
	private CitizenManagementService service;
	
	@PostMapping("/generateSSN")
	public String handleGenerateSSNButton(@RequestBody Citizen citizen) {
		Boolean isgenerateSSNumber = service.GenerateCitizenSSNumber(citizen);
		if(isgenerateSSNumber) {
			return "ss number is generated";
		}
		else
			return "ss number is not generated";
	}
	
	@GetMapping("getCitizen/{SSNumber}")
	public ResponseEntity<Object> handleFindCitizenButton(@PathVariable("SSNumber") Long SSNumber) {
		Citizen citizen = service.getCitizenBySSNNUmber(SSNumber);
		if(citizen!=null)
			return new ResponseEntity<Object>(citizen,HttpStatus.OK);
		else
			throw new NoSSNFoundException();
	}

}
