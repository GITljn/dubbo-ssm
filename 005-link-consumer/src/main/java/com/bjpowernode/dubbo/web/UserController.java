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
    public String userDetail(Integer id, Model model){
        User user = userService.queryUserById(id);
        Integer count = userService.queryAllUserCount();
        model.addAttribute("user", user);
        model.addAttribute("count", count);
        return "userDetail";
    }
}
