package com.sparta.myselectshop2.repository;

import com.sparta.myselectshop2.model.User;
import com.sparta.myselectshop2.model.UserTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTimeRepository extends JpaRepository<UserTime, Long> {
    UserTime findByUser(User user);
}
