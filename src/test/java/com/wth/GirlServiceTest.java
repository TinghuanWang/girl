package com.wth;

import com.wth.data.Girl;
import com.wth.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wth on 2018/3/27.
 * <p>
 * SpringBootTest:将启动整个spring的工程
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    GirlService girlService;

    @Test
    public void findOne() {

        Girl girl = girlService.findOne(2);
        Assert.assertEquals(new Integer(17), girl.getAge());
    }

}
