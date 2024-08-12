package org.ac.cst8277.{LastName}.{FirstName}.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String username;
    private String password;
    private String role;

    // Getters and Setters
}
