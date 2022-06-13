package com.www.service;
import static org.junit.Assert.*;
import com.www.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class UserServiceTest {

    @Resource
    private UserService userService;
    @Test
    public void testCheckLogin(){
        User user = userService.checkLogin("wang6", "123456");
        assertNull(user);
    }
}
