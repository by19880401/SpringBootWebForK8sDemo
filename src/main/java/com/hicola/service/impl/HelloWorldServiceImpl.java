package com.hicola.service.impl;

import com.hicola.controller.HelloWorldController;
import com.hicola.service.IHelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements IHelloWorldService {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldServiceImpl.class);

    @Override
    public void helloWorld() {
        LOGGER.info("We say hello to the world, it's amazing.");
    }
}
