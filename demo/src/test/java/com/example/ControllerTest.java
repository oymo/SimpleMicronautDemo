package com.example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.client.StreamingHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@MicronautTest
public class ControllerTest {

    @Inject
    @Client("/")
    StreamingHttpClient client;

    @Test
    public void verifyHelloWorldResponse() {
        String response = client.toBlocking()
                .retrieve(HttpRequest.GET("/hello/Thomas"));
        assertEquals("Hello Thomas!", response);

//        HttpRequest<Object> request = HttpRequest.GET("hello/Thomas");
//        HttpResponse<String> response = client.toBlocking().exchange(request, String.class);
//        assertEquals(HttpStatus.OK, response.getStatus());
//        assertEquals("Hello Thomas!", response.getBody().orElse("NOT FOUND!"));
    }
}
