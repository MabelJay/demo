package com.example.demo.Controller;

import com.example.demo.dataObject.UserInfo;
import com.example.demo.service.UserInfoService;
import com.example.demo.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserInfoController {
    @Autowired
    private UserInfoServiceImpl userInfoService;

    @RequestMapping("/list")
    public String getAllUserInfoList(Model model, HttpServletRequest request){
        List<UserInfo> list = userInfoService.getAllUsers();
        System.out.println(list);
        model.addAttribute("list", list);
        return "/showUser";
    }
}
