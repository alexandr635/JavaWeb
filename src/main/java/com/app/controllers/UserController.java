package com.app.controllers;

import com.app.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getUsers")
    public String findUsers(Model model){
        var users = userService.findAll();
        model.addAttribute("users", users);

        return "showUsers";
    }
}
