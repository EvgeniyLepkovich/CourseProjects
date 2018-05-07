package by.bsuir.analytics.dao;

import by.bsuir.analytics.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
