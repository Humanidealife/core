/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.directmedia.onlinestore.core.entity;

import java.util.HashSet;

/**
 *
 * @author wangq
 */
public class Catalogue {
    //On va ajouter une propriété statique sous forme de "HashSet"
    //Ne pas oulier que "Hash" est une Class à imoprter
    //On a choisi d'instancier cette propriété ici dès l'origine, mais cela n'est forcément nécessaire.
    //Pour ceux qui connaissent les génériques, on aurit pu écrire <Work> derrière le premier HashSet,
    //  puisque cette collection va contenir uniquement les oeuvres artistiques.
    
    public static HashSet<Work> listOfWorks = new HashSet();
}
