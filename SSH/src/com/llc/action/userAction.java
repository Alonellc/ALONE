package com.llc.action;

import com.llc.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author alone
 * @program: SSH
 * 用户
 * @date 2019年 11月29日 17:19:49
 */
public class userAction extends ActionSupport {

    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String execute(){
            userService.add();
        return NONE;
    }
}
