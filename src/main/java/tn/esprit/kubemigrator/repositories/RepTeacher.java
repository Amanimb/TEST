package tn.esprit.kubemigrator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.kubemigrator.entities.Teacher;

@Repository
public interface RepTeacher extends JpaRepository<Teacher,Long> {
}
