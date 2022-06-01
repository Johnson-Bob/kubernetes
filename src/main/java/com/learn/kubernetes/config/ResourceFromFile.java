package com.learn.kubernetes.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "test")
public class ResourceFromFile {
  private String name;
  private Map<String, String> data = new HashMap<>();
  private List<String> books = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Map<String, String> getData() {
    return data;
  }

  public void setData(Map<String, String> data) {
    this.data = data;
  }

  public List<String> getBooks() {
    return books;
  }

  public void setBooks(List<String> books) {
    this.books = books;
  }
}
