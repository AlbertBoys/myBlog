package com.edjblog;

import com.edjblog.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private UserController userController;

    @Test
    void contextLoads() {
        System.out.println(userController.findById(1));
    }

}
