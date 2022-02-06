package com.tiburcio.bicycles.dto;

import java.util.List;

import lombok.Value;

@Value
public class UserInfo {
	public UserInfo(String id, String displayName, String email, List<String> roles) {
		this.id = id;
		this.displayName = displayName;
		this.email = email;
		this.roles = roles;
	}

	public String id, displayName, email;
	public List<String> roles;
	
//	public String toString() {
//		String rolito = "";
//		for(int i = 0; i < roles.size(); i++) {
//			rolito += roles.get(i);
//		}
//		return "id: " + id + ", displayName: " + displayName + ", email: " + email + ", roles: " + rolito;
//	}
}
