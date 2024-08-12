package org.ac.cst8277.{LastName}.{FirstName}.service;

import org.ac.cst8277.{LastName}.{FirstName}.model.Message;
import org.ac.cst8277.{LastName}.{FirstName}.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getMessagesByUserId(UUID userId) {
        return messageRepository.findByUserId(userId);
    }

    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }
}
