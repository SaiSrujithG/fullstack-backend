package com.codewitharj.fullstackbackend.repository;

import com.codewitharj.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
