package com.zero.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zero-j
 */
@Controller
@RequestMapping("/server")
public class HelloController {


    @RequestMapping(value = "/status",method = RequestMethod.GET)
    public String ServerHealthy(){
        return "I am eureka Client I'm healthy is ok ...";
    }

}
