package tn.esprit.kubemigrator.services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.kubemigrator.entities.Student;
import tn.esprit.kubemigrator.repositories.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Page<Student> getAllStudents(String className, String teacherFirstName, String teacherLastName, Pageable pageable) {
        if (className != null) {
            return studentRepository.findBySchoolClassName(className, pageable);
        } else if (teacherFirstName != null && teacherLastName != null) {
            return studentRepository.findBySchoolClassTeacherFirstNameAndSchoolClassTeacherLastName(teacherFirstName, teacherLastName, pageable);
        } else {
            return studentRepository.findAll(pageable);
        }
    }
}
