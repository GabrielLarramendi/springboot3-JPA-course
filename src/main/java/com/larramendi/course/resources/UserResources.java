package com.larramendi.course.resources;

import com.larramendi.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1, "Maria", "maria@gmail.com", "99999999", "123435");
        return ResponseEntity.ok().body(u);
    }
}