package top.sunxitao.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 孙成涛
 * @Date: 2024/2/28 15:58
 */
@RestController
@CrossOrigin
public class Demo1Controller {

    @GetMapping("/demo1")
    public Object demo1(){
        return "这是一个端口号为9003的子项目";
    }
}
