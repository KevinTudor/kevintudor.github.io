package com.refinedshopper.refinedshopper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Controller
public class RefinedshopperApplication {

    public static void main(String[] args) {
        SpringApplication.run(RefinedshopperApplication.class, args);
    }

    @GetMapping("/World")
    public String World(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @RequestMapping(value = "/greet", method=RequestMethod.GET)
    public ModelAndView greet(@RequestParam(value = "name", required=false, defaultValue="World!")final String name, final Model model) {
        return new ModelAndView("home", "name", name);
    }
 
}
