package com.autoschedule.schedule.util;

public class HttpCode {
    
    /**
     * 成功
     */
    public static final int SUCCESS = 200;
    
    /**
     * 请求错误
     *
     */
    public static final int REQUEST_ERROR = 400;
    /**
     * 未授权，请登录
     */
    public static final int UNAUTHORIZED = 401;
    /**
     * 拒绝访问
     */
    public static final int ACCESS_DENIED = 403;
    
    /**
     * 请求地址出错
     */
    public static final int REQUEST_ADDRESS_ERROR = 404;
    
    /**
     * 请求超时
     */
    public static final int REQUEST_TIMED_OUT = 408;
    
    /**
     * 服务未实现
     */
    public static final int NOT_IMPLEMENTED = 501;
    
    /**
     * 服务不可用
     */
    public static final int SERVICE_UNAVAILABLE = 503;
    
    /**
     * 网关超时
     */
    public static final int GATEWAY_TIMEOUT = 504;
    /**
     * HTTP版本不受支持
     */
    public static final int HTTP_VERSION_NOT_SUPPORTED = 505;
    /**
     * 网关错误
     */
    public static final int BAD_GATEWAY = 502;
    
    /**
     * 服务器内部错误
     */
    public static final int INTERNAL_SERVER_ERROR = 500;
    
    /**
     * 验证码过期
     */
    public static final int VERIFICATION_EXPIRED = 5001;
    /**
     * 验证码错误
     */
    public static final int VERIFICATION_ERROR = 5002;
    /**
     * 账号不存在
     */
    public static final int ACCOUNT_NOT_EXIST = 5003;
    /**
     * 密码不正确
     */
    public static final int INCORRECT_PASSWORD = 5004;
    /**
     * 账号失效
     */
    public static final int ACCOUNT_INVALID = 5005;
    /**
     * 用户名重复
     */
    public static final int ACCOUNT_DUPLICATE = 5006;
    
    /**
     * 旧密码错误
     */
    public static final int OLDPASSWORD_ERROR = 5007;
}