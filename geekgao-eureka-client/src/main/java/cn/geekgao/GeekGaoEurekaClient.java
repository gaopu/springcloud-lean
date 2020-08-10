package cn.geekgao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GeekGaoEurekaClient {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(GeekGaoEurekaClient.class, args);

		while (true) {
			Thread.sleep(1000);
		}
	}

}
