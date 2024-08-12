package org.ac.cst8277.{LastName}.{FirstName}.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private UUID userId;
    private String content;

    // Getters and Setters
}
