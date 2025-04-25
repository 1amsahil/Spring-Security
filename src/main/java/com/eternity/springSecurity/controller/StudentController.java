package com.eternity.springSecurity.controller;

import com.eternity.springSecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Sahil","java"),
            new Student(2,"Eternity","React"),
            new Student(3,"Jack","JS")
    ));

    @GetMapping("list")
    public List<Student> getList()
    {
        return students;
    }

    @PostMapping("addStudent")
    public Student addStudent(@RequestBody Student st)
    {
        students.add(st);
        return st;
    }

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request)
    {
        return (CsrfToken)request.getAttribute("_csrf");
    }

}
