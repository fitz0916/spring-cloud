package com.imoco.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gousili on 2017/11/9.
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。
 * 比如在代码中调用了service-hi服务的“/hi”接口，
 * Hystric 加上fallback的指定类
 */

@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystrix.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
