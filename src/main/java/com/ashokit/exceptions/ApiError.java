package com.ashokit.exceptions;

import java.util.Date;

import lombok.Data;

@Data
public class ApiError {

	private Integer code;
	private String msg;
	private Date date;
}
