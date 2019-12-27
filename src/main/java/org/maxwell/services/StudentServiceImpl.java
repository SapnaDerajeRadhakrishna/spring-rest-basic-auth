package org.maxwell.services;

import java.util.List;

import org.maxwell.model.Student;
import org.maxwell.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(String studentId) {
        studentRepository.delete(studentRepository.findOne(studentId));
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findOne(String studentId) {
        return studentRepository.findOne(studentId);
    }

}
