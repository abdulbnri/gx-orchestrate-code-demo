package com.example.nri.console.service.demo.runner;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class Runner implements CommandLineRunner {

    private final Environment environment;

    @Override
    public void run(String... args) {
        var param1 = environment.getProperty("param1");
        var param2 = environment.getProperty("param2");

        log.info("param1: [{}], param2: [{}]", param1, param2);
    }
}
