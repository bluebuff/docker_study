package org.hdg.dockerstudy.model;

/**
 * @auther: huangxiaojun
 * @date: 2019/08/09 12:11
 */
public class Result<T> {
    private int status;
    private String msg;
    private T data;

    public Result(){

    }

    public Result(int status,String msg,T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
