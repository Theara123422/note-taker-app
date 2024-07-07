package com.api.note.user.model.repository;

import com.api.note.user.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u from User u where u.email = :email")
    Optional<User> findByEmail(String email);
    
    Optional<User> findByUsername(String username);
}