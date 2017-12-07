package org.kleinech.spring.boot.app;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "test.config")
public class Properties {

  @NotNull
  @Size(
    min = 1,
    max = 10,
    message = "The length of the name must be between {min} and {max}."
  )
  @Pattern(regexp = "\\w+")
  private String name;

  public String getName() {
    return name;
  }

  public Properties setName(String name) {
    this.name = name;
    return this;
  }
}
