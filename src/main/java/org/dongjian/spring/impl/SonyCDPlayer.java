package org.dongjian.spring.impl;

import org.dongjian.spring.CD;
import org.dongjian.spring.CDPlayer;
import org.springframework.stereotype.Component;

@Component
public class SonyCDPlayer implements CDPlayer {
    CD cdName;

    public SonyCDPlayer(CD cdName) {
        this.cdName = cdName;
    }

    public void play() {
        System.out.println("playing...");
    }
}
