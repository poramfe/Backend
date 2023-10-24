package com.poramfe.poramfe.user.controller;

import com.poramfe.poramfe.user.dto.*;
import com.poramfe.poramfe.user.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthService authService;
    @PostMapping("/signUp")
    public ResponseDto<?> signUp(@RequestBody SignUpDto requestBody){

        ResponseDto<?> result = authService.signUp(requestBody);
        return result;
    }
    @PostMapping("/signIn")
    public ResponseDto<SignInResponseDto> signIn(@RequestBody SignInDto requestbody){
        ResponseDto<SignInResponseDto> result = authService.signIn(requestbody);
        return result;
    }

}
