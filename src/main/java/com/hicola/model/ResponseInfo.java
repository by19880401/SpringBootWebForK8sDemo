package com.hicola.model;

import java.util.List;
import java.util.Map;

public class ResponseInfo<T> {
    public static final String SUCCESS_CODE = "200";
    public static final String SUCCESS_MSG = "success";
    public static final String ERROR_CODE = "500";
    public static final String ERROR_MSG = "error";

    private String errorCode;
    private String errorMsg;
    private T data;

    public static ResponseInfo returnSuccessMsg() {
        ResponseInfo res = new ResponseInfo();
        res.setErrorCode(SUCCESS_CODE);
        res.setErrorMsg(SUCCESS_MSG);
        return res;
    }

    public static ResponseInfo responseSuccessMsg(Map data) {
        ResponseInfo res = new ResponseInfo();
        res.setErrorCode(SUCCESS_CODE);
        res.setErrorMsg(SUCCESS_MSG);
        res.setData(data);
        return res;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
