package com.learn.kubernetes;

import com.learn.kubernetes.config.ResourceFromFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloWorldHandler {

  @Autowired
  private ResourceFromFile resource;

  public Mono<ServerResponse> hello(ServerRequest request) {
    Response response = new Response(resource.getName(), resource.getData(), resource.getBooks());
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
        .body(BodyInserters.fromValue(response));
  }
}
