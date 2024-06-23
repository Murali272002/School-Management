package com.essilor.test.Testing.repository;

import com.essilor.test.Testing.dto.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeacherRepository extends JpaRepository<Teacher, UUID> {
}
