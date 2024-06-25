package com.murali.test.Testing.service;

import com.murali.test.Testing.dto.Teacher;
import com.murali.test.Testing.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public Teacher addTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getTeachers(){
        return teacherRepository.findAll();
    }
}
