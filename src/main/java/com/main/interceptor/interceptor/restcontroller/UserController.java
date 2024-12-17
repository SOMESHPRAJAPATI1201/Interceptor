package com.main.interceptor.interceptor.restcontroller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.main.interceptor.interceptor.model.User;

@RestController
@RequestMapping("/auth")
@Slf4j
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

    @PostMapping("/user")
    public ResponseEntity<?> createUser(@RequestBody User user){
        log.warn("user created");
        return ResponseEntity.ok(user);
    }
    

}
