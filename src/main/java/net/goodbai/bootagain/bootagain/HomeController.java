package net.goodbai.bootagain.bootagain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.GroupedFlux;
import reactor.core.publisher.Mono;

import java.util.Comparator;

@RestController
public class HomeController {
    @GetMapping
    public String greeting(@RequestParam(required = false, defaultValue = "") String name) {
//        Flux.just("alpha", "bravo", "charlie")
//                .map(String::toUpperCase)
//                .flatMap(s -> Flux.fromArray(s.split("")))
//                .groupBy(String::toString)
//                .sort((o1, o2) -> o1.key().compareTo(o2.key()))
//                .flatMap(group -> Mono.just(group.key()).and(group.count()))
//                .map(keyAndCount -> keyAndCount.getT1() + " => " + keyAndCount.getT2())
//                .subscribe(System.out::println);
        return name.equals("") ? "Hey!" : name + " Hey!";
    }
}
