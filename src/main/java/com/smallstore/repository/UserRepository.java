package com.smallstore.repository;
 
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smallstore.config.entity.User;
 
@Repository
public interface UserRepository extends CrudRepository<com.smallstore.config.entity.User, Long> {
    List<User> findUsersByUsernameAndPassword(String u, String p);
}