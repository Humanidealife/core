/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.directmedia.onlinestore.core.entity;

/**
 *
 * @author wangq
 */
public class Work {
    
    //Et un constructeur sans paramètre pour bien respecter le format de JavaBean
    public Work() {    
    }

    //On génère le constructeur paticulier qui prend le title en paramètre
    public Work(String title) {
        this.title = title;
    }
    
    //On rajoute donc des prorpiétés privées
    
    //On rajoute un attribut "id"
    private long id;
    private String title;
    private String genre;
    private int release;
    private String summary;
    //L'Artist principal, il s'agit d'une propriété de type Artist
    private Artist mainArtist;
    
    //On ajoute donc les getter et setter à nos propriétés

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Artist getMainArtist() {
        return mainArtist;
    }

    public void setMainArtist(Artist mainArtist) {
        this.mainArtist = mainArtist;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
    
    
}
