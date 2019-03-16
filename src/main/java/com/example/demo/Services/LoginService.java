package com.example.demo.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class LoginService implements LoginServiceImpl{
    @Override
//    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
