package com.august.mallcopy.common.api;

public enum ResultCode implements IErrorCode {
    SUCCESS(200, "operation succeed."),
    FAILED(500, "operation failed."),
    VALIDATE_FAILED(404, "input paramenters failed."),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");

    private long code;
    private String msg;

    private ResultCode(long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
