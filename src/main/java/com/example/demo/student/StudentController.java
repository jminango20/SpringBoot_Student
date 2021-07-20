package com.example.demo.student;
//Esta clase vai ter todos os Resources do API

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("app/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "juan",
                        "juan@gmail.com",
                        33,
                        LocalDate.of(1987, Month.AUGUST,14)
                )
        );
    }

}
