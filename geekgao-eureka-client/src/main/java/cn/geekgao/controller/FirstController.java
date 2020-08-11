package cn.geekgao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "ribbon")
    public String ribbon() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-Server-HA");
        String serverAddress = serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" +
                serviceInstance.getPort();

        return "Hello World! @ " + serverAddress;
    }
}
