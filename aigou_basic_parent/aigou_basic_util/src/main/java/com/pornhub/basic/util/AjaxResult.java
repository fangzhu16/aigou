package com.pornhub.basic.util;

/**
 * Ajax请求结果的封装
 */
public class AjaxResult {

    private boolean success;

    private String message;

    private Object restObj;

    private Integer errorCode;

    private AjaxResult() {
    }

    public static AjaxResult getAjaxResult() {
        return new AjaxResult();
    }

    public boolean isSuccess() {
        return success;
    }


    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getRestObj() {
        return restObj;
    }

    public Object setRestObj(Object restObj) {
        this.restObj = restObj;
        return this;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public AjaxResult setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
