package com.ashokit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="CITIZEN_INFO")
@Data
public class Citizen implements Serializable{
	

	private static final long serialVersionUID = 7454131233958491148L;

	@Id
	@GeneratedValue
	@Column(name="CITIZEN_ID",length = 10)
	private Integer citizenId;
	
	@Column(name="FIRST_NAME",length=50)
	private String firstName;
	
	@Column(name="LAST_NAME",length=50)
	private String lastName;
	
	@Column(name="GENDER",length=10)
	private String gender;
	
	@Column(name="DATE_OF_BIRTH")
	private Date dob;
	
	@Column(name="STATE",length=20)
	private String state;
	
	@Column(name="SS_NUMBER",length=20)
	private Long SSNumber;
}
