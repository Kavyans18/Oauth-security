package com.pws.Oath2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class Oath2Application {

	@GetMapping("/oath")
	public String message(Principal principal) {
		return "Hi "+principal.getName()+" welcome to Spring Oath 2 Example";
	}

	public static void main(String[] args) {
		SpringApplication.run(Oath2Application.class, args);
	}

}
