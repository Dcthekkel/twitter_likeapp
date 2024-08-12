package org.ac.cst8277.{LastName}.{FirstName}.repository;

import org.ac.cst8277.{LastName}.{FirstName}.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);
}
