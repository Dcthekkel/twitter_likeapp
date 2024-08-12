
package org.ac.cst8277.{LastName}.{FirstName}.controller;

import org.ac.cst8277.{LastName}.{FirstName}.service.AuthService;
import org.ac.cst8277.{LastName}.{FirstName}.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        UUID userId = authService.authenticate(username, password);
        return userService.generateToken(userId);
    }

    @GetMapping("/validate")
    public boolean validateToken(@RequestParam String token) {
        return userService.validateToken(token);
    }
}
