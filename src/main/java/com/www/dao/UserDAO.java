package com.www.dao;

import com.www.bean.User;

public interface UserDAO {
    public User queryUserByName(String name);
}
