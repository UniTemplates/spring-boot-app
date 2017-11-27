package org.kleinech.spring.boot.app;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
@EnableConfigurationProperties(Properties.class)
public class Configuration {
  private Properties properties;

  public Configuration(final Properties properties) {
    this.properties = properties;
  }

  @Bean
  public String testBean() {
    return properties.getName();
  }
}
