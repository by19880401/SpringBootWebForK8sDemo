package com.hicola.controller;

import com.hicola.model.ResponseInfo;
import com.hicola.service.IHelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    private final IHelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(IHelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @PostMapping("/hi")
    public ResponseInfo sayHello() {
        LOGGER.info("Receive the request");
        helloWorldService.helloWorld();
        return ResponseInfo.returnSuccessMsg();
    }

    @GetMapping("generateUUID")
    public ResponseInfo generateRandomUUID(){
        LOGGER.info("receive the request to generate UUID");
        Map<String,String> uuidMap = helloWorldService.generateNormalUUID();
        return ResponseInfo.responseSuccessMsg(uuidMap);
    }


}
