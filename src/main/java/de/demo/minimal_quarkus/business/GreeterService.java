package de.demo.minimal_quarkus.business;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreeterService {

    // @Value("${greeting.suffix:!}")
    String suffix = "?";

    public String greet(String name) {
        return String.format("Hello %s%s", name, suffix);
    }
}