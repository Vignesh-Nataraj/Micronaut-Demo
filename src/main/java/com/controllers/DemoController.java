package com.controllers;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller("/test")

public class DemoController {
    private static final Logger logger
            = LoggerFactory.getLogger(DemoController.class);

    @Get("print")
    @Produces(MediaType.APPLICATION_JSON)

    public String testController() {
        logger.info("Test Logging");
        return "Controller Implemented Successful";
    }

}
