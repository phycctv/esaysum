package com.phycctv.easysum.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phycctv.easysum.model.Book;
import com.phycctv.easysum.repo.BookRepository;
import com.phycctv.easysum.repo.UserRepository;

@Controller
public class AppController {

	@Autowired
	private BookRepository repository;
	
	@Autowired
	private UserRepository userRepository;

	private static final Logger log = LoggerFactory.getLogger(AppController.class);

	@RequestMapping("/app")
	public String index(Model model) {
		log.info("app login");
		repository.save(new Book("Java"));
		repository.save(new Book("Node"));
		repository.save(new Book("Python"));

		return "app";
	}
}