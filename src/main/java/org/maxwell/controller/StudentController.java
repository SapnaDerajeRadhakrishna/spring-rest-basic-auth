package org.maxwell.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.maxwell.model.Student;
import org.maxwell.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(StudentController.BASE_URL)
public class StudentController {
    
    public static final String BASE_URL = "/api/v1/students";
    
    @Autowired
    private StudentService studentService;
        
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Object> getAllStudents() {
        List<Student> students = studentService.findAll();
        Map<String, Object> response = new LinkedHashMap<String, Object>();
        response.put("total students", students.size());
        response.put("students", students);
        return response;
    }
    
    @GetMapping({ "/{id}" })
    @ResponseStatus(HttpStatus.OK)
    public Student getStudentById(@PathVariable Long id) {
        return null;
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewStudent(@RequestBody Student student) {
        studentService.save(student);
    }

}
