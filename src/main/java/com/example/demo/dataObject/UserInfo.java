package com.example.demo.dataObject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@DynamicUpdate
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String userName;

    private String userPwd;

    public UserInfo() {
    }

    public UserInfo(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }
}
