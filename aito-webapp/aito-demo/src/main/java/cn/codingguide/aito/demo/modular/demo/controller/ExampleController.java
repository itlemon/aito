package cn.codingguide.aito.demo.modular.demo.controller;

import static cn.codingguide.aito.core.constants.ApiConstants.DEMO_API_PREFIX;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-06-18
 */
@Controller
@RequestMapping(DEMO_API_PREFIX)
public class ExampleController {

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, String> hello() {
        Map<String, String> res = new HashMap<>();
        res.put("Test", "Hello Aito.");
        return res;
    }

}
