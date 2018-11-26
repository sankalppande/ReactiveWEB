package com.sankalp.reactivedemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
public class Controller {

    private static final String API_BASE_PATH = "/api";
    Logger log = LogManager.getLogger(Controller.class);

    @GetMapping(API_BASE_PATH + "/images")
    Flux<Image> images() {

        return Flux.just(new Image("1", "learning-spring-boot-cover.jpg")
                , new Image("2", "learning-spring-boot-2nd-edition-cover.jpg")
                , new Image("3", "bazinga.png"));
    }


    @PostMapping(API_BASE_PATH + "/images")
    Mono<Void> create(@RequestBody Flux<Image> images) {

        return images
                .map(image -> {
                  log.info("We will save " + image + " to a Reactive database soon!");
                    return image;
                }).then();
    }
}

