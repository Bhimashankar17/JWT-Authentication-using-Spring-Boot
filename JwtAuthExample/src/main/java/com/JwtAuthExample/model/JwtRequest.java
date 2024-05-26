package com.JwtAuthExample.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequest {
	
	private String username;
    private String password;

}
