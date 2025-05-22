package org.example.dependencyinjection.database;

import org.springframework.stereotype.Component;

@Component
public interface Database {
    void persist(String data);
}
