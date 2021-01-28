package com.ashokit.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Citizen;
import com.ashokit.repo.CitizenRepositroy;

@Service
public class CitizenManagementServiceImpl implements CitizenManagementService {

	@Autowired
	CitizenRepositroy citizenRepo;

	@Override
	public boolean GenerateCitizenSSNumber(Citizen citizen) {
		citizen.setSSNumber(generateSSNumber());
		return citizenRepo.save(citizen) != null;
	}

	@Override
	public Citizen getCitizenBySSNNUmber(Long SSNumber) {
		return citizenRepo.findBySSNumber(SSNumber) ;
	}

	@Override
	public Long generateSSNumber() {
		Long result = (long) new Random().nextInt(1000000);
		return result;
	}

}
