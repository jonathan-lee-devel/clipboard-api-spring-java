package io.jonathanlee.clipboardapispringjava.controller;

import java.time.ZonedDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class IndexController {

  @GetMapping
  public Mono<String> index() {
    return Mono.just(ZonedDateTime.now().toString());
  }

}
