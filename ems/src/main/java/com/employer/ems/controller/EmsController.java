package com.employer.ems.controller;

import com.employer.ems.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmsController {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    @RequestMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("Chandan");
        user.setEmailId("chandan@gmail.com");

        return user;
    }

    @GetMapping("/{id}")
    public String pathVariable(@PathVariable String id) {
        return "The path Variable is: " + id;
    }

    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name,
                                @RequestParam(name = "email", required = false) String emailId) {
        return "Your name is:" + name + "and email is" + emailId;
    }

}
