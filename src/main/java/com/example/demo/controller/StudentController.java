package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.blind.annotation.*;
import com.example.demo.entity.Student;
@RestController

public class StudentControlle{
    @postMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return
    }
}