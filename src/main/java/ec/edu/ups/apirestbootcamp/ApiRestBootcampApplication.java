package ec.edu.ups.apirestbootcamp;

import ec.edu.ups.apirestbootcamp.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ApiRestBootcampApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiRestBootcampApplication.class, args);
    }

}
