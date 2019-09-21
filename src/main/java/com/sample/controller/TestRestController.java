package com.sample.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestRestController {
    private static final Logger logger = LoggerFactory.getLogger(TestRestController.class);

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;


    @GetMapping("/")
    public String main(Model model) {
        logger.info("Request mapping /");
        model.addAttribute("message", message);

        return "index"; //view
    }

}
