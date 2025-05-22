package org.example.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    public void sayHello() {
        System.out.println("Hello World");
    }
}
// service,controller and repository all of it manages the beans
