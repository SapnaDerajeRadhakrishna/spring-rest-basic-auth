package org.maxwell.services;

import java.util.List;

import org.maxwell.model.Student;

public interface StudentService {

    List<Student> findAll();

    Student save(Student student);

    void delete(String studentId);

    Student update(Student student);

    Student findOne(String studentId);
}
