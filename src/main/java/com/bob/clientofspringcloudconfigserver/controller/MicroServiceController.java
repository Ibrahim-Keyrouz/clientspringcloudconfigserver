package com.bob.clientofspringcloudconfigserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MicroServiceController {
    @Value("${clientspringcloudconfigserver.value}")
   private String value;

    @GetMapping("/endpoint")
    public String retrieveLimits(){
        return value;
    }
}
