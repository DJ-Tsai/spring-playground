package org.dongjian.spring.impl;

import org.dongjian.spring.CD;
import org.dongjian.spring.CDPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SonyCDPlayer implements CDPlayer {
    CD cdName;
//    String owner;

    @Autowired
    SonyCDPlayer(CD cdName/*, String owner*/) {
        this.cdName = cdName;
//        this.owner = owner;
    }

    public void play() {
        System.out.println("playing...");
        cdName.playSongs();
    }
}
