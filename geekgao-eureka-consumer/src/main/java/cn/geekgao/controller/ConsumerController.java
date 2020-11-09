package cn.geekgao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.geekgao.feign.ConsumerFeign;

@RestController
public class ConsumerController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private ConsumerFeign consumerFeign;

    @RequestMapping(value = "requestProvider")
    public String requestProvider() {
        return "provider said: " + consumerFeign.requestProvider();
    }

    @RequestMapping(value = "consumerHaTest")
    public String consumerHaTest() {
        // 根据服务名获取真实的服务地址信息，可以看出负载均衡是否起作用
        ServiceInstance serviceInstance = loadBalancerClient.choose("geekgao-eureka-provider");

        return serviceInstance.toString();
    }
}
