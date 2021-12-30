package com.hicola.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TimeScheduleTask {
    private static final Logger LOGGER = LoggerFactory.getLogger(TimeScheduleTask.class);

    @Scheduled(cron = "*/30 * * * * ?")
    public void execute() {
        LOGGER.info("The schedule task is running at {}.", System.currentTimeMillis());
    }
}
