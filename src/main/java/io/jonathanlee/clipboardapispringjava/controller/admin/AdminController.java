package io.jonathanlee.clipboardapispringjava.controller.admin;

import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/admin")
public class AdminController {

  @GetMapping
  public Mono<String> admin(Mono<Principal> principal) {
    return principal
        .map(Principal::getName)
        .map(name -> String.format("Greetings, %s!", name));
  }

}
