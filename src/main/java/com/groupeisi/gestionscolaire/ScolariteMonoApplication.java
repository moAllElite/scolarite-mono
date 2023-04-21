package com.groupeisi.gestionscolaire;

import com.groupeisi.gestionscolaire.model.User;
import com.groupeisi.gestionscolaire.repository.IUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Date;


@SpringBootApplication
public class ScolariteMonoApplication {

    public static void main(String[] args) {SpringApplication.run(ScolariteMonoApplication.class, args);}
    /*@Bean
    CommandLineRunner commandLineRunner(IUserRepository repository){
        return args->{
            repository.save(
                    new User(null, "mo", "niang", new Date(), "mo@gmail.com"));
            repository.save(
                    new User(null, "mody", "ndiaye", new Date(), "mody@gmail.com"));
            repository.save(
                    new User(null, "mo", "niang", new Date(), "mo@gmail.com"));
            repository.save(
                    new User(null, "mody", "ndiaye", new Date(), "mody@gmail.com"));
        };
    }*/

}
