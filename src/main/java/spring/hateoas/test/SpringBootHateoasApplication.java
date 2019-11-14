package spring.hateoas.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;
import spring.hateoas.test.service.IProductService;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootHateoasApplication implements ApplicationRunner {
	private final IProductService productService;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHateoasApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
	}

}
