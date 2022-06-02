package com.learn.kubernetes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration(proxyBeanMethods = false)
public class HelloWorldRouter {

  @Bean
  public RouterFunction<ServerResponse> route(HelloWorldHandler handler) {
    return RouterFunctions.route(RequestPredicates.GET("/hello")
            .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
        handler::hello);
  }
}
