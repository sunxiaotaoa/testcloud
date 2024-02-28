package top.sunxitao.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 孙成涛
 * @Date: 2024/2/28 16:00
 */
@RestController
@CrossOrigin
public class Demo2Controller {

    @GetMapping("/demo2")
    public Object demo2(){
        return "这是一个端口号为9004的子项目";
    }
}
