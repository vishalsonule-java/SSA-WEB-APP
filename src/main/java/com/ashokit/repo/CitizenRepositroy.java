package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Citizen;

public interface CitizenRepositroy extends JpaRepository<Citizen,Integer> {
	
	public Citizen findBySSNumber(Long SSNumber);

	
}
