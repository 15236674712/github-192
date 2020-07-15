package com.baizhi.github192;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Github192ApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("==Github写的代码==");
    }

    public static void main(String[] args) {
        int a=10;
        int b=10;
        a=a+b;
        System.out.println(a);
    }

}
