package com.www.service;

import com.www.bean.User;

public interface UserService {
    public User checkLogin(String userName, String userPwd);
}
