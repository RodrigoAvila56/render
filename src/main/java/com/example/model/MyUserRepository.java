package com.example.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MyUserRepository extends CrudRepository<MyUser,Long> {

    Optional<MyUser> findByUsername(String username);
}
