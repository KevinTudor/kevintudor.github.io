package com.refinedshopper.refinedshopper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class RefinedshopperApplication implements ErrorController {

    public static void main(String[] args) {
        SpringApplication.run(RefinedshopperApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "firstName", defaultValue = "Kevo") String name) {
        return String.format("Hello %s! It is semi WORKING!", name);
    }

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        // Implement your logic here. You might want to log the error or inspect the request to determine the status code.
        return "Error occurred. Please contact support.";
    }

}
