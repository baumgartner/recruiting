package com.untis.sso.dao;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Data
public class User {

	private Integer id;
	
	@NotBlank(message = "Name is mandatory")
	private String name;

	@NotBlank(message = "Password is mandatory")
	private String password;

}
