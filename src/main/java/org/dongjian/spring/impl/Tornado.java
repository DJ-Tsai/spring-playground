package org.dongjian.spring.impl;

import org.dongjian.spring.CD;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Tornado implements CD {
    private String artist = "Jay Chou";
    private List<String> songs;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
