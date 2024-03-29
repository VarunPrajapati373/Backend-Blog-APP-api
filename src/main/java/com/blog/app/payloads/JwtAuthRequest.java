package com.blog.app.payloads;

import lombok.Data;

@Data
public class JwtAuthRequest {

	//Email is considered as Name
	private String username;
	
	private String password;
	
}
