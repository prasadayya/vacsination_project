package com.project.vaccination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.vaccination.model.UserDetail;
import com.project.vaccination.service.UserserIMPL;

@Controller

public class UserController {
    
    @Autowired
    UserserIMPL us;
    
    @GetMapping("/index")
    public String home() {
        return "index";
      
    }

    @PostMapping("/index")
    public String register(@ModelAttribute UserDetail u){
      us.addUser(u);
        System.out.println(u);
        return "index";  
    }

    @GetMapping("/register")
    public String getAllRegisters() {
        List<UserDetail> users = us.getAllUserModels();
        users.forEach(data -> System.out.println(data.toString()));
        return "redirect:/index";
    }
}
