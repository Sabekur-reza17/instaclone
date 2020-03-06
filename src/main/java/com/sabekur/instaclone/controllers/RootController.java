package com.sabekur.instaclone.controllers;

import com.sabekur.instaclone.models.User;
import com.sabekur.instaclone.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class RootController {
    @GetMapping("/")
    public String root(Model model) {
        model.addAttribute("msg", "Welcome to Instagram Clone Home Page");
        return "index";
    }



}