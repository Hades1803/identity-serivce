package com.tobias.identity_service.repository;

import com.tobias.identity_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,String> {

    boolean existsByUsername(String username);
}
