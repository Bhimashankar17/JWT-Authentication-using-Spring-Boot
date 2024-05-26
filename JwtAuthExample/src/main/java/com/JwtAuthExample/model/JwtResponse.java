package com.JwtAuthExample.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtResponse {

	private String jwtToken;
	private String username;
}
