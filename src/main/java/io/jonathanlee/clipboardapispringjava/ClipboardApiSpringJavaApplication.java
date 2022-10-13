package io.jonathanlee.clipboardapispringjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class ClipboardApiSpringJavaApplication {

  public static void main(String[] args) {
    SpringApplication.run(ClipboardApiSpringJavaApplication.class, args);
  }

}
