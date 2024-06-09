package tn.esprit.kubemigrator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.kubemigrator.entities.SchoolClass;

@Repository
public interface RepSchoolClass extends JpaRepository<SchoolClass,Long> {
}
