package org.dongjian.spring.impl;

import org.dongjian.spring.CD;
import org.dongjian.spring.CDPlayer;
import org.dongjian.spring.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class SonyCDPlayerTest {

    @Autowired
    private CDPlayer sonyPlayer;

//    @Autowired
//    private CD cd;

    @Test
    public void test() {
//        assertNotNull(cd);
        sonyPlayer.play();
    }
}
