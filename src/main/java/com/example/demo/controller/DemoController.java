package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {

    @GetMapping(value = "/demo/getItem")
    public String getItem(@RequestParam(value = "id") String id){
        log.info(String.format("商品id=%s", id));
        return id;
    }
}
