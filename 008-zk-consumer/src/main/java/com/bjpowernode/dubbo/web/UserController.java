package com.bjpowernode.dubbo.web;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/userDetail")
    public String userDetail(Integer id, String username, Model model) {
        User user = userService.queryUserById(id, username);
        model.addAttribute("user", user);
        return "userDetail";
    }
}
