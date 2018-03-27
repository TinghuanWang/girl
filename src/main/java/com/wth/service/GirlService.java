package com.wth.service;

import com.wth.dao.GirlRepository;
import com.wth.data.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wth on 2018/3/23.
 */
@Service
public class GirlService {

    @Autowired
    GirlRepository girlRepository;

    public Object save(Girl girl) {

        return girlRepository.save(girl);
    }

    public Object findAll() {

        return girlRepository.findAll();
    }

    public Girl findOne(long id) {

        return girlRepository.findOne(id);
    }

    public void getAge(long id) throws Exception {

        Girl girl = girlRepository.findOne(id);
        if (girl.getAge() < 12) {

            throw new Exception("你应该读小学了吧");
        } else if (girl.getAge() >= 12 && girl.getAge() <= 18) {

            throw new Exception("你应该在中学");
        } else {
            throw new Exception("你应该在读大学或者走入社会了");
        }
    }
}
