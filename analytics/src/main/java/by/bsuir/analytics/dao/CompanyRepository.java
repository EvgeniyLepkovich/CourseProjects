package by.bsuir.analytics.dao;

import by.bsuir.analytics.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}
