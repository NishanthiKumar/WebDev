package com.example.webdev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebDevController {
	
	@GetMapping(value="/hi")
	public String dev() {
		return "GEM.KRALICE";
	}

}
