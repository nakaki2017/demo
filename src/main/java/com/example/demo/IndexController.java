package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: susie
 * @create: 2019-05-22 19:27
 **/
@RestController
public class IndexController {

    @GetMapping(value = "/index")
    public String createOrder(HttpServletRequest request) {
        return "index";
    }
}
