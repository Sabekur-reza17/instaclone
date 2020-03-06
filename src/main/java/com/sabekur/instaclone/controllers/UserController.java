package com.sabekur.instaclone.controllers;

import com.sabekur.instaclone.models.User;
import com.sabekur.instaclone.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") User user) {
        userService.register(user);

        return "user/show-user";
    }
    @GetMapping("/user/show-all-user")
    public String showAll_GET(Model model) {
        List<User> listUsers = userService.getAllUsers();
        model.addAttribute("listUsers", listUsers);
        return "user/show-all-user";
    }

}
