package cn.codingguide.model.response;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-06-09
 */
@Getter
@ToString
@NoArgsConstructor
public class Message {

    private static final String DEFAULT_SUCCESS_MESSAGE = "请求成功";

    private static final String DEFAULT_ERROR_MESSAGE = "网络异常";

    private static final Integer DEFAULT_SUCCESS_CODE = 200;

    private static final Integer DEFAULT_ERROR_CODE = 500;

    private Boolean success;

    private Integer code;

    private String message;

    private Object data;

    private final String timestamp = LocalDateTime.now().toString();

    private Message(Boolean success, Integer code, String message, Object data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Message ok() {
        return ok(null);
    }

    public static Message ok(Object data) {
        return ok(DEFAULT_SUCCESS_CODE, DEFAULT_SUCCESS_MESSAGE, data);
    }

    public static Message ok(Integer code, String message, Object data) {
        return new Message(true, code, message, data);
    }

    public static Message error(String message) {
        return error(DEFAULT_SUCCESS_CODE, message);
    }

    public static Message error(Integer code, String message) {
        return error(code, message, null);
    }

    public static Message error(Integer code, String message, Object data) {
        return new Message(false, code, message, data);
    }
}
