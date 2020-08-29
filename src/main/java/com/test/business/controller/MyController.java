package com.test.business.controller;


import com.test.business.entity.Student;
import com.test.business.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    public StudentService studentService;

    @RequestMapping(value = "/getStudents", method = RequestMethod.GET)
    public List<Student> findStudents(){
        return studentService.findAll();
    }
}

