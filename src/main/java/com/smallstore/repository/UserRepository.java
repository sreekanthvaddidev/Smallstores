package com.smallstore.repository;
 
import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.smallstore.config.entity.User;
 
public interface UserRepository extends CrudRepository<com.smallstore.config.entity.User, Long> {
    List<User> findUsersByUsernameAndPassword(String u, String p);
}