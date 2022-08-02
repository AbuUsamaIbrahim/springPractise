package springpractise.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import javax.persistence.PostUpdate;

@SpringBootApplication/*(exclude = SecurityAutoConfiguration.class)*/
public class TrainingApplication {

    public static void main(String[] args) {

        SpringApplication.run(TrainingApplication.class, args);

    }

}
