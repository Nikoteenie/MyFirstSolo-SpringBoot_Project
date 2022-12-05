package com.example.MyFirstSoloSpringBoot_Project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;
  @Entity
public class Music {
       @Id
       @GeneratedValue
    private Integer rank;
    private String artist;
    private String favAlbum;
    private Integer numAlbums;
    private String genre;

    public Music(Integer rank, String artist, String favAlbum, Integer numAlbums, String genre) {
        this.rank = rank;
        this.artist = artist;
        this.favAlbum = favAlbum;
        this.numAlbums = numAlbums;
        this.genre = genre;
    }

    public Music() {
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getFavAlbum() {
        return favAlbum;
    }

    public void setFavAlbum(String favAlbum) {
        this.favAlbum = favAlbum;
    }

    public Integer getNumAlbums() {
        return numAlbums;
    }

    public void setNumAlbums(Integer numAlbums) {
        this.numAlbums = numAlbums;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return Objects.equals(rank, music.rank) && Objects.equals(artist, music.artist) && Objects.equals(favAlbum, music.favAlbum) && Objects.equals(numAlbums, music.numAlbums) && Objects.equals(genre, music.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, artist, favAlbum, numAlbums, genre);
    }

    @Override
    public String toString() {
        return "Music{" +
                "rank=" + rank +
                ", artist='" + artist + '\'' +
                ", favAlbum='" + favAlbum + '\'' +
                ", numAlbums=" + numAlbums +
                ", genre='" + genre + '\'' +
                '}';
    }
}
