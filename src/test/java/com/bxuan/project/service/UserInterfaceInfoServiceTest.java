package com.bxuan.project.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author: BXuan
 * @Date: 2023/04/05/ 14:46
 * @description 用户接口测试类
 */
@SpringBootTest
public class UserInterfaceInfoServiceTest {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Test
    public void invoke(){
        boolean b = userInterfaceInfoService.invokeCount(1L, 1L);
        if (b){
            System.out.println("Good");
        }
    }
}
