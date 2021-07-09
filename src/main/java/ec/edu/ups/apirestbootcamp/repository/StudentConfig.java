package ec.edu.ups.apirestbootcamp.repository;

import ec.edu.ups.apirestbootcamp.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(IStudentRepository studentRepository) {
        return args -> {
           Student fernando =  new Student(1L, "Fernando Cusco", LocalDate.of(2021, Month.JULY, 7), "admin@admin.com");
           Student ana = new Student("Ana Martinez", LocalDate.of(2021, Month.JULY, 7), "amarinez@admin.com");
           Student alexa = new Student("Alexa Cuesta", LocalDate.of(2021, Month.JULY, 7), "alexa@admin.com");
           studentRepository.saveAll(List.of(fernando, ana, alexa));
        };
    }

}
