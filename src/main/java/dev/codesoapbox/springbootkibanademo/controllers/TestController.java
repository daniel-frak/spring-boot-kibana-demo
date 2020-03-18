package dev.codesoapbox.springbootkibanademo.controllers;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(TestController.class);

    @GetMapping
    public void logTestMessage() {
        log.info("This is a test log");
    }
}
