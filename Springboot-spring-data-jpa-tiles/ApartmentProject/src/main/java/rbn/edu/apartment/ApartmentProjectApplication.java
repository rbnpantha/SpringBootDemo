package rbn.edu.apartment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "rbn.edu.apartment")
public class ApartmentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApartmentProjectApplication.class, args);
	}
}
