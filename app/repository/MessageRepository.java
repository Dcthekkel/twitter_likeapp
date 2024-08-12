package org.ac.cst8277.{LastName}.{FirstName}.repository;

import org.ac.cst8277.{LastName}.{FirstName}.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface MessageRepository extends JpaRepository<Message, UUID> {
    List<Message> findByUserId(UUID userId);
}
