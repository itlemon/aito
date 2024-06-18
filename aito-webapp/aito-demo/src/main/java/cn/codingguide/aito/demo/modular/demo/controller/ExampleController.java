package cn.codingguide.aito.demo.modular.demo.controller;

import cn.codingguide.model.response.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static cn.codingguide.aito.core.constants.ApiConstants.DEMO_API_PREFIX;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-06-18
 */
@RestController
@RequestMapping(DEMO_API_PREFIX)
public class ExampleController {

    @GetMapping("/hello")
    public Message hello() {
        return Message.ok("hello aito.");
    }

}
