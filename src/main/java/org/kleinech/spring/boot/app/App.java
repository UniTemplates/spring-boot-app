package org.kleinech.spring.boot.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
  private static Logger logger = LoggerFactory.getLogger(App.class);

  private Configuration configuration;

  public App(final Configuration configuration) {
    this.configuration = configuration;
  }

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Override
  public void run(String... strings) throws Exception {
    logger.info("Name: '{}'", configuration.testBean());
  }
}
