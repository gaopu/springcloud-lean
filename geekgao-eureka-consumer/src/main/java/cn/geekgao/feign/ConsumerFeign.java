package cn.geekgao.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "geekgao-eureka-provider")
public interface ConsumerFeign {
    @RequestMapping(value = "provider", method = RequestMethod.GET)
    String requestProvider();
}
