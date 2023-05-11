package com.teluguskillhub.springsecurity.Repository;

import com.teluguskillhub.springsecurity.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
