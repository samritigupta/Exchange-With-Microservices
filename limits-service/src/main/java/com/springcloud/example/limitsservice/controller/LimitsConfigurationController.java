package com.springcloud.example.limitsservice.controller;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.example.limitsservice.config.Configuration;
import com.springcloud.example.limitsservice.config.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration(){
        return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
    }

    /*@GetMapping("/fault-tolerant-example")
    @HystrixCommand(fallbackMethod = "fallbackRetreiveConfiguration")
    public LimitConfiguration retrieveConfiguration(){
        throw new RuntimeException("----- exception for fault tolerance ----");
        // If this service goes down then its corresponding service also goes down to prevent this use hystrix.
    }

    public LimitConfiguration fallbackRetreiveConfiguration() {
        return new LimitConfiguration(9,99);
    }*/
}
