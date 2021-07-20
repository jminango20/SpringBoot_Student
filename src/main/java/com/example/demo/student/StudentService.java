package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Juan Minango",
                        "juan@gmail.com",
                        33,
                        LocalDate.of(1987, Month.NOVEMBER,29)
                )
        );
    }


}