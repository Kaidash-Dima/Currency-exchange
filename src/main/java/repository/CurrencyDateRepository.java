package repository;

import entity.CurrencyDate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyDateRepository extends JpaRepository<CurrencyDate, Long> {
}
