package com.tiburcio.bicycles.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LoginRequest {
	@NotBlank
    private String email;
 
    @NotBlank
    private String password;

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}
}
