package cn.geekgao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GeekGaoEurekaConsumer {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(GeekGaoEurekaConsumer.class, args);
	}

}
