package com.example.demo.repository;

import com.example.demo.dataObject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    List<UserInfo> findAll();
}
