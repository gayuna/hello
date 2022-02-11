package com.coupang.tb3.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gahan1(Yuna)
 * @since 2022-02-11
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello!";
    }
}
