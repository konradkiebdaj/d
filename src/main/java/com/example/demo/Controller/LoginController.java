package com.example.demo.Controller;

import com.example.demo.Models.LoginUser;
import com.example.demo.Models.User;
import com.example.demo.Validators.LoginValidator;
import com.example.demo.Validators.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    private LoginValidator loginValidator;

    @InitBinder
    protected void initBinder(WebDataBinder binder){
        binder.addValidators(loginValidator);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String postLogin(@ModelAttribute("loginUser") @Validated LoginUser loginUser, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return "login";
        }

        return "home";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("loginUser", new LoginUser());
        return "login";
    }

}
