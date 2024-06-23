package com.essilor.test.Testing.controller;

import com.essilor.test.Testing.dto.Teacher;
import com.essilor.test.Testing.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/school-management/api/v1")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/getName")
    public String getName(){
        return "Muralidharan Narayana";
    }

    @PostMapping("/teacher")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);
    }
}
