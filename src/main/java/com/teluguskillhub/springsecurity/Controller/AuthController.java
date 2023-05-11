package com.teluguskillhub.springsecurity.Controller;

import com.teluguskillhub.springsecurity.Payload.Request.UserRequest;
import com.teluguskillhub.springsecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserRequest createUser(@RequestBody UserRequest userRequest){
        return userService.createUser(userRequest);
    }
}
