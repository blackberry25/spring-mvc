package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

    @RequestMapping("/one")
    public RedirectView one(){
        RedirectView redirectView=new RedirectView();
        redirectView.setUrl("two");
        return redirectView;

    }

    @RequestMapping("/two")
    public String two(){
        return "redirect:/three";
    }

    @RequestMapping("/three")
    public String three(){
        return "contact";
    }
}
