package lk.oshan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuleApplication.class, args);
	}

}
