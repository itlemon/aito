package cn.codingguide.aito.model.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.feiniaojin.gracefulresponse.data.Response;
import com.feiniaojin.gracefulresponse.data.ResponseStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2024-08-14
 */
@Getter
@Setter
@ToString
public class AitoResponse implements Response {

    private Boolean success;

    private Integer code;

    private String message;

    private Object data;

    private final String timestamp = LocalDateTime.now().toString();

    @Override
    public void setStatus(ResponseStatus statusLine) {
        this.code = Integer.parseInt(statusLine.getCode());
        this.message = statusLine.getMsg();
        this.success = this.code == 0;
    }

    @Override
    @JsonIgnore
    public ResponseStatus getStatus() {
        return null;
    }

    @Override
    public void setPayload(Object payload) {
        this.data = payload;
    }

    @Override
    @JsonIgnore
    public Object getPayload() {
        return null;
    }
}
