package com.reljicd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class SingleController {
    @GetMapping("/single")
    public String single() {
//        if (principal != null) {
//            return "redirect:/home";
//        }
        return "/single";
    }
}
