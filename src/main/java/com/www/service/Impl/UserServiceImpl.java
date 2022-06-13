package com.www.service.Impl;
import com.www.bean.User;
import com.www.dao.UserDAO;
import com.www.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;
    @Override
    public User checkLogin(String userName, String userPwd) {
        System.out.println("pull 1");
        User user = userDAO.queryUserByName(userName);
        if(user!=null){
            if(userPwd.equals(user.getUserPwd())){
                return user;
            }else {
                return null;
            }
        }
        return null;
    }
}
