package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController {

    @Value("${api.order.url}")
    String apiOrderUrl;

    @GetMapping("/product")
    public String product() {
        log.debug("produect service log test");
        log.debug(apiOrderUrl);
        return apiOrderUrl;
    }
}
