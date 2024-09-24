package com.nri.webhook_poc.webhook_poc.controller;

import com.nri.webhook_poc.webhook_poc.model.Response;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/message", produces = "application/hal+json")
@Slf4j
public class ReceiveController {

    @GetMapping
    public String demo() {
        return "Hello World!";
    }

    @PostMapping
    public Response receive(HttpServletRequest request) {
        var sign = request.getHeader("X-Komainu-Signature");
        var time = request.getHeader("X-Komainu-Timestamp");
        log.info("sign - [{}]. time - [{}]", sign, time);
        return new Response(124L, "f2");
    }

}
