package com.test.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	public String getDetails() {
		return "Jenkins Test CI/CD";
	}

}
