package com.huwei.sweetmusicplayer.baidumusic.resp;

import org.apache.http.conn.scheme.PlainSocketFactory;

/**
 * @author Jayce
 * @date 2015/6/13
 */
public class BaseResp {

    public static final int ERROR_CODE_OK=22000;
    public static final int ERROR_CODE_ERROR=22001;
    private int error_code;


    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
    public boolean isValid(){
        return error_code==0||error_code== ERROR_CODE_OK;
    }

}
