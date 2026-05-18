package com.example.ex04.controller;

import com.example.ex04.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/QuyBoTuoi")
public class StudentController {
    static List<Student>lists=new ArrayList<>();
    public StudentController() {
        lists.add(new Student("SV01", "Quy", 8.5));
        lists.add(new Student("SV02", "Bo", 7.8));
        lists.add(new Student("SV03", "Tuoi", 9.2));
    }

    @GetMapping(value = "/sinhvien",
    produces = {
            "application/json",
            "application/xml"
    })
    public List<Student> sinhvien() {
        return lists;
    }
}
