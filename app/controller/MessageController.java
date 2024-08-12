package org.ac.cst8277.{LastName}.{FirstName}.controller;

import org.ac.cst8277.{LastName}.{FirstName}.model.Message;
import org.ac.cst8277.{LastName}.{FirstName}.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Message>> getMessagesByUserId(@PathVariable UUID userId) {
        List<Message> messages = messageService.getMessagesByUserId(userId);
        return ResponseEntity.ok(messages);
    }

    @PostMapping
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        Message createdMessage = messageService.createMessage(message);
        return ResponseEntity.ok(createdMessage);
    }
}
