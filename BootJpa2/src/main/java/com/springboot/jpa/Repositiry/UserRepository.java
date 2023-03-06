package com.springboot.jpa.Repositiry;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.entites.User;

public interface UserRepository  extends CrudRepository<User, Integer>{

}
