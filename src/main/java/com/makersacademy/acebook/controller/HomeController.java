package com.makersacademy.acebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	// The controller is a bit like the controllers in Sinatra apps where you get a request and serve the corresponding view
	@RequestMapping(value = "/") // for example, get '/'
	public String index() {
		return "index"; // and return html file with this name
	}

}
