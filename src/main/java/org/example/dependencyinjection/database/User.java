package org.example.dependencyinjection.database;

//types of dependency injection there is constructor,setter and Field.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("")
public class User {
    @Value("${database.username}")
    private String username;

    @Value("${database.password}")
    private String password;

    @Value("${database.database}")
    private String database;







    // this is the Field injection
//    @Autowired
//    @Qualifier("postgressDatabase")
private Database database1;
private Database database2;

   @Autowired
   public User( @Qualifier("postgressDatabase") Database database1,Database database2) {
       this.database1 = database1;
       this.database2 = database2;
   }
//
//    public void setUserDatabase( @Qualifier("postgressDatabase")Database database1,Database database2){
//        this.database1 = database1;
//
//    }

    public void saveUser(String name){
        database1.persist(name);
        database2.persist(name);
    }

    public void printSecrets(){
        System.out.println(username);
        System.out.println(password);
        System.out.println(database);

    }
}
