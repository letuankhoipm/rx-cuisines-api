package com.cuisines.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cuisines.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
