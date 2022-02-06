package com.tiburcio.bicycles.dto;

import lombok.Value;

@Value
public class JwtAuthenticationResponse {
	public JwtAuthenticationResponse(String accessToken, UserInfo user) {
		this.accessToken = accessToken;
		this.user = user;
		System.out.println("En el JwtAuthenticationResponse");
		System.out.println(accessToken);
		System.out.println(user.toString());
	}
	public String accessToken;
    public UserInfo user;
}
