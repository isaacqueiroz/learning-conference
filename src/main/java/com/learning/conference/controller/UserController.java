package com.learning.conference.controller;


import com.learning.conference.model.Registration;
import com.learning.conference.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    //Returns the actual body of the request
    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Isaac") String firstName,
            @RequestParam(value = "lastName", defaultValue = "Queiroz") String lastName,
            @RequestParam(value = "age", defaultValue = "32") int age) {
        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println("User firstname: " + user.getFirstName());

        return user;
    }

}
