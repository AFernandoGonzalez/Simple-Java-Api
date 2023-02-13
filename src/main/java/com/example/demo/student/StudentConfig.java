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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student marco = new Student(
//                         1L,
                         "Mariam",
                         "m@gmail.com",
                         LocalDate.of(2000, Month.JANUARY, 5),
                         21
                 );
            Student mark = new Student(
//                    1L,
                    "Mariam",
                    "m@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5),
                    21
            );
//            save to db
            repository.saveAll(
                    List.of(marco, mark)
            );
        };
    }
}
