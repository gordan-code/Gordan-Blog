package com.wip;

import com.wip.utils.TaleUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBlogApplicationTests {

    @Test
    public void contextLoads() {
    	String username= "xiaobai";
    	int password=123456;
    	 String pwd = TaleUtils.MD5encode(username + password);
    	 System.out.println(pwd);
    }

}
