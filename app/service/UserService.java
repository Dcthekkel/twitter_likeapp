
package org.ac.cst8277.{LastName}.{FirstName}.service;

import org.ac.cst8277.{LastName}.{FirstName}.model.User;
import org.ac.cst8277.{LastName}.{FirstName}.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    private ConcurrentHashMap<String, UUID> tokenStore = new ConcurrentHashMap<>();

    public User getUserById(UUID id) {
        return userRepository.findById(id).orElse(null);
    }

    public String generateToken(UUID userId) {
        String token = UUID.randomUUID().toString();
        tokenStore.put(token, userId);
        return token;
    }

    public boolean validateToken(String token) {
        return tokenStore.containsKey(token);
    }

    public Optional<UUID> getUserIdFromToken(String token) {
        return Optional.ofNullable(tokenStore.get(token));
    }

    public void revokeToken(String token) {
        tokenStore.remove(token);
    }
}
