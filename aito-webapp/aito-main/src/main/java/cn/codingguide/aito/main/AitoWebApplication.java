package cn.codingguide.aito.main;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.feiniaojin.gracefulresponse.EnableGracefulResponse;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-06-18
 */
@Slf4j
@EnableGracefulResponse
@SpringBootApplication(scanBasePackages = "cn.codingguide.aito")
public class AitoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AitoWebApplication.class, args);
        log.info("start {} is success!", AitoWebApplication.class.getSimpleName());
    }

}
