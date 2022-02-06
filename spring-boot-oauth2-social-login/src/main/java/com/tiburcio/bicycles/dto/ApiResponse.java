package com.tiburcio.bicycles.dto;

import lombok.Value;

@Value
public class ApiResponse {
	
	private Boolean success;
    private String message;
    
    public ApiResponse(boolean b, String error) {
		this.success = b;
		this.message = error;
	}
}
