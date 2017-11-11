package org.dongjian.spring.impl;

import org.dongjian.spring.CDPlayer;
import org.dongjian.spring.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class SonyCDPlayerTest {

    @Autowired
    private CDPlayer sonyPlayer;

    @Test
    public void test() {
        sonyPlayer.play();
    }
}
