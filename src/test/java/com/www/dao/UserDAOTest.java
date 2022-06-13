package com.www.dao;

import com.www.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class UserDAOTest {

    @Resource
    private UserDAO userDAO;
    @Test
    public void queryUserByName() {
        User user = userDAO.queryUserByName("zhangsan");
        System.out.println(user);
    }
}