package com.refinedshopper.refinedshopper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    
    @GetMapping("/World")
    public String World(@RequestParam(value = "name", defaultValue = "Worlds") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/test")
    public String home(@RequestParam(value = "name", defaultValue = "HAHAH") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

}
