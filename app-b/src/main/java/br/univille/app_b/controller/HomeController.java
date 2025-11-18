package br.univille.app_b.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.dapr.Topic;
import io.dapr.client.domain.CloudEvent;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @PostMapping("/startbsync")
    public ResponseEntity startBSync(@RequestBody String message) {
        System.out.println("App B started");
        System.out.println("Message received: " + message);
        return ResponseEntity.ok().body("App B started");
    }


    @Topic(pubsubName = "pubsub-dapr", name = "topicodapr")
    @PostMapping(path="/sub", consumes = org.springframework.http.MediaType.ALL_VALUE)
    public ResponseEntity startBASync(@RequestBody(required = false) CloudEvent<String> cloudEvent) {
        System.out.println("App B started");
        var idMessage = cloudEvent.getId();
        var message = cloudEvent.getData();
        System.out.println("Message " + idMessage +  " received: " + message);
        return ResponseEntity.ok().body("App B started");
    }
}
