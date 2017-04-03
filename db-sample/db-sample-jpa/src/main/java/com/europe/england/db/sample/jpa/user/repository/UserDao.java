package com.europe.england.db.sample.jpa.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.europe.england.db.sample.jpa.user.entity.UserEO;

public interface UserDao extends CrudRepository<UserEO, Long> {

}
