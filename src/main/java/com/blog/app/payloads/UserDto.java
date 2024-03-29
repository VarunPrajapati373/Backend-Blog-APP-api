package com.blog.app.payloads;

import java.util.HashSet;
import java.util.Set;

import com.blog.app.entities.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//This class is created to Expose some details of user, we are not using entity classs to expose because that is directly linked to DB.
//used for Data Transfer

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min = 4, message = "Username must be min of 4 character !!")
	private String name;
	
	@Email(message = "Email address is not valid !!")
	private String email;
	
	@NotEmpty
	@Size(min = 3, max = 10, message = "Password must be between 3-10 characters")
	private String password;
	
	@NotEmpty
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();
}
