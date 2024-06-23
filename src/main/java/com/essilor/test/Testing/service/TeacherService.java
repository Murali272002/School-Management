package com.essilor.test.Testing.service;

import com.essilor.test.Testing.dto.Teacher;
import com.essilor.test.Testing.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public Teacher addTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }
}
