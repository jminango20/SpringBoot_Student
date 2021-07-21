package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student juan = new Student(
                  "Juan",
                  "juan@gmail.com",
                  33,
                  LocalDate.of(1987, Month.NOVEMBER,29)
          );
          Student andrea = new Student(
                  "Andrea",
                  "andrea@gmail.com",
                  33,
                  LocalDate.of(1987, Month.AUGUST,14)
          );

          repository.saveAll(
                  List.of(juan,andrea)
          );
        };
    }
}
