package cn.geekgao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GeekGaoEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(GeekGaoEurekaServer.class, args);
    }

}
