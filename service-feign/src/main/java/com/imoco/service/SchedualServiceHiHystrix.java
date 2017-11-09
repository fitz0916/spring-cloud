package com.imoco.service;

import org.springframework.stereotype.Component;

/**
 * Created by gousili on 2017/11/9.
 */
@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry~ fallBack " + name;
    }
}
