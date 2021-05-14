package com.techprimers.jaegerserver.controller;

import com.techprimers.jaegerserver.service.JaegerServerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/jaeger/server")
public class JaegerServerController {

  private JaegerServerService jaegerServerService;

  public JaegerServerController(JaegerServerService jaegerServerService) {
    this.jaegerServerService = jaegerServerService;
  }

  @GetMapping("/{id}")
  public Mono<String> get(@PathVariable("id") Integer id) {
    return jaegerServerService.get(id);
  }
}
