package org.example.dependencyinjection.database;

import org.springframework.stereotype.Component;

@Component
public class PostgressDatabase implements Database{
    @Override
    public void persist(String data) {
        System.out.println("Adding into Postgress Database " +data);
    }
}
