/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.directmedia.onlinestore.core.entity;

/**
 *
 * @author wangq
 */
public class Artist {
    //Artist bénéficie d'une propriété privée
    private String name;
    
    //Pour rester compatible avec la norme JavaBean, on va ajouter un constructeur sans paramètre

    public Artist() {
    }
    
    //On va également lui ajouter un constructeur

    public Artist(String name) {
        this.name = name;
    }
    
    //On va lui ajouter un getter et un setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
