package com.blog.app.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JwtAuthResponse {

	private String token;
	
	private UserDto user;
	
}
