package org.example.dependencyinjection;

import org.example.dependencyinjection.database.MysqlDatabase;
import org.example.dependencyinjection.database.PostgressDatabase;
import org.example.dependencyinjection.database.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyinjectionApplication {

    public static void main(String[] args) {

      var context =  SpringApplication.run(DependencyinjectionApplication.class, args);
//      Hello hello = context.getBean(Hello.class);
//      hello.sayHello();
//
//        PostgressDatabase postgressDatabase = context.getBean(PostgressDatabase.class);
//        postgressDatabase.persist("Hello World");
//
//        MysqlDatabase mysqlDatabase = context.getBean(MysqlDatabase.class);
//        mysqlDatabase.persist("Hello World");

        User user = context.getBean(User.class);
//        user.saveUser("Florence");
//        user.saveUser("Ronaldo");
//        Hello hello = new Hello();
//        hello.sayHello();



        user.printSecrets();
    }

}
