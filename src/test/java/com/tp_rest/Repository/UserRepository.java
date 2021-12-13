package com.tp_rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp_rest.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
