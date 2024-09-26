package com.francopaiz.postgresql.repository;

import com.francopaiz.postgresql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
