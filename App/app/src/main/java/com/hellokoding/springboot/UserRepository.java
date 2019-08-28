package com.hellokoding.springboot;

import org.springframework.data.repository.CrudRepository;

import com.hellokoding.springboot.Players;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<Players, Integer> {

}
