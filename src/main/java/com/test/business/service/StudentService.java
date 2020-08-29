package com.test.business.service;

import com.test.business.entity.Student;
import com.test.business.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    public List<Student> findAll(){
        List<Student> list = studentRepository.findAll();
        return list;
    }
}
