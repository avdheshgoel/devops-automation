package com.lloyds.student_service.service;

import com.lloyds.student_service.exception.StudentNotFoundException;
import com.lloyds.student_service.model.Student;
import com.lloyds.student_service.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
//    private final StudentConverter studentConverter;

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) throws StudentNotFoundException {
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found"));
    }
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public int delete(int id) {
        studentRepository.deleteById(id);
        return id;
    }


}
