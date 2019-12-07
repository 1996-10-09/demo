package com.kln.swst.demo.controller;

import com.kln.swst.demo.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/students")
public class Studentcontroller {
    @RequestMapping(method= RequestMethod.GET)
    public Student get() throws IllegalArgumentException{
        Student student= new Student();
        student.setName("Anton");
        student.setAdress("237,colombo");
        student.setAge(23);
        return student;
    }


}
