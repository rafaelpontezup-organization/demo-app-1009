package br.com.zup.edu.demoapp1009;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = ErrorMvcAutoConfiguration.class) // Needed by Zalando Problem lib
public class DemoApp1009Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoApp1009Application.class, args);
	}

}
