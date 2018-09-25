package com.example.demo.service.impl;

import com.example.demo.repository.UserInfoRepository;
import com.example.demo.dataObject.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    private UserInfoRepository userInfoRepository;
    @Override
    public List<UserInfo> getAllUsers() {
        return userInfoRepository.findAll();
    }
}
