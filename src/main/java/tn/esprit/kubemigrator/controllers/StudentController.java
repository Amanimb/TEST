package tn.esprit.kubemigrator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.kubemigrator.entities.Student;
import tn.esprit.kubemigrator.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public Page<Student> getAllStudents(
            @RequestParam(required = false) String className,
            @RequestParam(required = false) String teacherFullName,
            Pageable pageable
    ) {
        String teacherFirstName = null;
        String teacherLastName = null;

        if (teacherFullName != null) {
            String[] nameParts = teacherFullName.split(" ");
            if (nameParts.length == 2) {
                teacherFirstName = nameParts[0];
                teacherLastName = nameParts[1];
            }
        }

        return studentService.getAllStudents(className, teacherFirstName, teacherLastName, pageable);
    }
}
