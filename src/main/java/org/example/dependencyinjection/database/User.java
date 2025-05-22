package org.example.dependencyinjection.database;

//types of dependency injection there is constructor,setter and Field.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("")
public class User {

    // this is the Field injection
//    @Autowired
//    @Qualifier("postgressDatabase")
private Database database;

    @Autowired
    public User( @Qualifier("postgressDatabase") Database database) {
        this.database = database;
    }

    public void saveUser(String name){
        database.persist(name);
    }
}
