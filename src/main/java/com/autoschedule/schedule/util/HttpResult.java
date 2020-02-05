package com.autoschedule.schedule.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;


@Getter
@Setter
public class HttpResult {
    private int code;
    private String msg;
    private Object data;
    
    public static HttpResult error(){
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(),"未知异常，请联系管理员");
    }

    public static HttpResult error(String msg) {
        return error(HttpCode.INTERNAL_SERVER_ERROR, msg);
    }

    public static HttpResult error(int code,String msg){
        HttpResult result = new HttpResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static HttpResult ok(String msg) {
        HttpResult r = new HttpResult();
        r.setCode(HttpCode.SUCCESS);
        r.setMsg(msg);
        return r;
    }

    public static HttpResult ok(Object data) {
        HttpResult r = new HttpResult();
        r.setCode(HttpCode.SUCCESS);
        r.setData(data);
        return r;
    }
    public static HttpResult ok(String msg, Object data){
        HttpResult r = new HttpResult();
        r.setMsg(msg);
        r.setCode(HttpCode.SUCCESS);
        r.setData(data);
        return r;
    }
    public static HttpResult ok() {
        HttpResult r = new HttpResult();
        r.setCode(200);
        return r;
    }
}
