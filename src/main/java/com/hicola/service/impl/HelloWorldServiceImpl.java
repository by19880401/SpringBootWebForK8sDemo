package com.hicola.service.impl;

import com.hicola.service.IHelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class HelloWorldServiceImpl implements IHelloWorldService {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldServiceImpl.class);

    @Override
    public void helloWorld() {
        LOGGER.info("We say hello to the world, it's amazing.");
    }

    @Override
    public Map<String, String> generateNormalUUID() {
        Map<String, String> mapResult = new HashMap<>();
        mapResult.put("normal", UUID.randomUUID().toString());
        LOGGER.info(mapResult.toString());
        return mapResult;
    }
}
