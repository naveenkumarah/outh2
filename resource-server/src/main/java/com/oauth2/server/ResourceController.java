package com.oauth2.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	@RequestMapping("/test")
	public String test() {
		return "Hello World";
	}
}
