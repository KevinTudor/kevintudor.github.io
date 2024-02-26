package com.refinedshopper.refinedshopper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RefinedshopperApplication {

    public static void main(String[] args) {
        SpringApplication.run(RefinedshopperApplication.class, args);
    }

}
