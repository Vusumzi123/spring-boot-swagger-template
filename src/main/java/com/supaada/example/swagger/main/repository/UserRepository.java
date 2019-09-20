package com.supaada.example.swagger.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.supaada.example.swagger.main.bean.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
