package com.mentor.app.moneyapp.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

  @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
  public String hello() {
    return "Hello World!";
  }
}
