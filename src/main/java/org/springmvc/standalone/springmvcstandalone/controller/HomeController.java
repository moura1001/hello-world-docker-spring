package org.springmvc.standalone.springmvcstandalone.controller;

import org.springmvc.standalone.springmvcstandalone.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("user", new User());
        return "home";
    }

    @PostMapping("/user")
    public String user(@ModelAttribute User user, Model model){
        model.addAttribute("user", user);
        return "home";
    }
}
