package com.imoco.controller;

import com.imoco.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gousili on 2017/11/9.
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
