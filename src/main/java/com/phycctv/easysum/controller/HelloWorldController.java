package com.phycctv.easysum.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	private static final Logger log = LoggerFactory.getLogger(HelloWorldController.class);
    @RequestMapping("/")
    public String index(Model model) {
    	model.addAttribute("name", "hhhhhhhhh");
    	log.info("test");
        return "index";
    }
}