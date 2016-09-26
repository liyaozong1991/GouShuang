package com.goushuang.lyz.controller;

import com.goushuang.lyz.services.LoginService;
import com.goushuang.lyz.viewObject.LoginMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value ="/whichlog", method = RequestMethod.POST)
    public String customer(@ModelAttribute LoginMessage loginMessage, Model model){
        return loginService.loginCheck(loginMessage, model);
    }
}