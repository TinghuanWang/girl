package com.wth.controller;

import com.wth.acpect.HttpAspect;
import com.wth.data.Girl;
import com.wth.data.Result;
import com.wth.service.GirlService;
import com.wth.utile.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by wth on 2018/3/23.
 */
@RestController
@RequestMapping(value = "crud")
public class GirlController {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Autowired
    GirlService girlService;

    @PostMapping(value = "save")
    public Object save(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {

            return ResultUtils.error(1, bindingResult.getFieldError().getDefaultMessage());
        }

        return ResultUtils.success(girlService.save(girl));
    }

    @GetMapping(value = "findAll")
    public Object findAll() {

        logger.info("findAll");
        return girlService.findAll();
    }

    @GetMapping(value = "getAge/{id}")
    public void getAge(@PathVariable long id) throws Exception {

        girlService.getAge(id);
    }
}
