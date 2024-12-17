package com.main.interceptor.interceptor.restcontroller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.interceptor.interceptor.model.User;

@RestController
@RequestMapping("/auth")
public class UserController {


    private List<User> users = List.of(
        new User(1,"Somesh","Indore"),
        new User(2,"Ramesh","Ujjain"),
        new User(3,"Raghav","Gwalior"),
        new User(4,"Ramendra","Dewas")
    );

    @GetMapping("/users")
    public ResponseEntity<?> getMethodName() {
        return ResponseEntity.ok(users);
    }
    

}
