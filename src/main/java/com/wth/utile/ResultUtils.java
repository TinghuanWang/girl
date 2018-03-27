package com.wth.utile;

import com.wth.data.Result;

/**
 * Created by wth on 2018/3/26.
 */
public class ResultUtils {

    public static Result success(Object obj) {

        Result result = new Result();
        result.setCode(0);
        result.setMsg("SUCCESS");
        result.setData(obj);
        return result;
    }

    public static Result error(Integer code, String msg) {

        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
