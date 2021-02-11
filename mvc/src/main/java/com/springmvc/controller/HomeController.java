package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("index page is calling");


        model.addAttribute("name","manish gupta");
        model.addAttribute("flist",123);


        return "index";
    }






    @RequestMapping("/help")
    public ModelAndView help(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","nirajk singh");
        List<String> f=new ArrayList<String>();
        f.add("i");
        f.add("love");
        f.add("you");
        modelAndView.addObject("friends",f);
        modelAndView.setViewName("help");
        return  modelAndView;
    }
}

