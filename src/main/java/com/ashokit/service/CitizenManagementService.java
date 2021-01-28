package com.ashokit.service;

import com.ashokit.entity.Citizen;

public interface CitizenManagementService {

	public boolean GenerateCitizenSSNumber(Citizen citizen) ;
	public Citizen getCitizenBySSNNUmber(Long id);
	public Long generateSSNumber();
}
