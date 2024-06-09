package tn.esprit.kubemigrator.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.kubemigrator.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Page<Student> findBySchoolClassName(String className, Pageable pageable);
    Page<Student> findBySchoolClassTeacherFirstNameAndSchoolClassTeacherLastName(String firstName, String lastName, Pageable pageable);
}
