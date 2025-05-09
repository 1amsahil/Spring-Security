package com.eternity.springSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping({"hello","/"})
    public String greeting(HttpServletRequest request)
    {
        return "Hello "+request.getSession().getId();
    }

}
