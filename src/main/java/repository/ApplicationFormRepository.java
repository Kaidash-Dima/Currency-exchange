package repository;

import entity.ApplicationForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationFormRepository extends JpaRepository<ApplicationForm, Long> {
}
