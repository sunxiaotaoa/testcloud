package top.sunxitao.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 孙成涛
 * @Date: 2024/2/28 15:29
 */
@CrossOrigin
@RestController
public class DemoController {

    @GetMapping("/test")
    public Object test(){
        return "这是一个端口号为9002的项目";
    }
}
