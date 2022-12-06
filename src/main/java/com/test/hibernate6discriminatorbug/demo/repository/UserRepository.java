package com.test.hibernate6discriminatorbug.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.hibernate6discriminatorbug.demo.model.User;

import jakarta.transaction.Transactional;

@Transactional
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
