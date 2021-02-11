package com.springmvc.controller;

import com.springmvc.Model.User;
import com.springmvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Contact {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void common(Model m){
        m.addAttribute("dear"," best legend");
        m.addAttribute("para","god");
    }

    @RequestMapping("/register")
    public String contact(){
        return "contact";
    }

    @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String handleForm(@ModelAttribute("user") User user, Model model){
        System.out.println(user);
//        System.out.println("kuch print kanhe nhi ho rha console pe");
        userService.createUser(user);
        return "manish";
    }



}

