package com.wth.hanlder;

import com.wth.data.Result;
import com.wth.utile.ResultUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wth on 2018/3/26.
 *
 * 统一异常处理
 */
@ControllerAdvice
public class ExceptionHanlder {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception ex) {

//        if(ex instanceof GirlEx){
//
//        }

        return ResultUtils.error(100, ex.getMessage());
    }
}
