package top.sunxitao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author: 孙成涛
 * @Date: 2024/2/28 16:01
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ServiceDemo2Application {
    public static void main(String[] args) {
        SpringApplication.run(ServiceDemo2Application.class,args);
    }
}
