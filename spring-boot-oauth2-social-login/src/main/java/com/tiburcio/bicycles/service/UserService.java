package com.tiburcio.bicycles.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import com.tiburcio.bicycles.dto.LocalUser;
import com.tiburcio.bicycles.dto.SignUpRequest;
import com.tiburcio.bicycles.exception.UserAlreadyExistAuthenticationException;
import com.tiburcio.bicycles.model.User;

public interface UserService {
	public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;
	 
    User findUserByEmail(String email);
 
    Optional<User> findUserById(Long id);
 
    LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
