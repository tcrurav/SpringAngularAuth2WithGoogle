package com.tiburcio.bicycles.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.tiburcio.bicycles.dto.ApiResponse;
import com.tiburcio.bicycles.dto.JwtAuthenticationResponse;
import com.tiburcio.bicycles.dto.LocalUser;
import com.tiburcio.bicycles.dto.LoginRequest;
import com.tiburcio.bicycles.dto.SignUpRequest;
import com.tiburcio.bicycles.exception.UserAlreadyExistAuthenticationException;
import com.tiburcio.bicycles.security.jwt.TokenProvider;
import com.tiburcio.bicycles.service.UserService;
import com.tiburcio.bicycles.util.GeneralUtils;
 
import lombok.extern.slf4j.Slf4j;
 
@Slf4j
@RestController
@RequestMapping("/api/auth")
public class AuthController {
 
    @Autowired
    AuthenticationManager authenticationManager;
 
    @Autowired
    UserService userService;
 
    @Autowired
    TokenProvider tokenProvider;
 
    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = tokenProvider.createToken(authentication);
        System.out.println("jwt");
        System.out.println(jwt);
        LocalUser localUser = (LocalUser) authentication.getPrincipal();
        System.out.println("Ya tengo el localuser");
        JwtAuthenticationResponse rollito = new JwtAuthenticationResponse(jwt, GeneralUtils.buildUserInfo(localUser));
        System.out.println("Ahora viene el rollito");
        System.out.println(rollito.toString());
        System.out.println("Se acabo el rolito");
        return ResponseEntity.ok(rollito);
    }
 
    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
    	System.out.println("Estoy en el signup");
        try {
        	System.out.println(signUpRequest.toString());
            userService.registerNewUser(signUpRequest);
        } catch (UserAlreadyExistAuthenticationException e) {
            //Log.error("Exception Ocurred", e); //TIBURCIO
        	System.out.println("Hubo un error");
            return new ResponseEntity<>(new ApiResponse(false, "Email Address already in use!"), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok().body(new ApiResponse(true, "User registered successfully"));
    }
}
