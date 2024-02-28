package top.sunxitao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author: 孙成涛
 * @Date: 2024/2/28 15:26
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ApplicationService {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationService.class,args);
    }
}
