package com.hc.test.controller;

import com.hc.test.model.HcUser;
import com.hc.test.service.HcUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class HcUserController {
    @Autowired
    HcUserService hcUserService;

    @GetMapping("/list")
    public List<HcUser> list() {
        log.info("------- query db success.");
        return hcUserService.getList();
    }
}
