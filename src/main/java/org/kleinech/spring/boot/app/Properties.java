package org.kleinech.spring.boot.app;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "test.config")
public class Properties {

  @NotNull
  private String name;

  public String getName() {
    return name;
  }

  public Properties setName(String name) {
    this.name = name;
    return this;
  }
}
