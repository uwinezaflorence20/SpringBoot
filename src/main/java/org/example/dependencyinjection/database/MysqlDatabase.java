package org.example.dependencyinjection.database;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MysqlDatabase implements Database {
    @Override
    public void persist(String data) {
        System.out.println("Adding into Mysql Database " +data);
    }
}
