package com.mitch.java_web_final_project.repository.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "song", schema = "song")
public class Song {

    @Id
    @GeneratedValue
    private Integer id;

    private String artist;

    private String song_name;

    private Integer genre;

    private String link;

    public Song(){}

    public Song(Integer id, String artist, String song_name, Integer genre,String link) {
        this.id = id;
        this.artist = artist;
        this.song_name = song_name;
        this.genre = genre;
        this.link = link;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }



    public Integer getGenre() {
        return genre;
    }

    public void setGenre(Integer genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", song_name='" + song_name + '\'' +
                ", genre=" + genre +
                ", link='" + link + '\'' +
                '}';
    }
}
