/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.directmedia.onlinestore.core.entity;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author wangq
 */
public class ShoppingCart {
    //Cette Class dispose d'un attriut au format "JavaBean"
    //Il faut d'abord importer l'interface "Set"
    //Pour éviter des ennuis dans le futur, on va immédiatement instancier cette Collection au travers d'un HashSet 
    private Set<Work> items = new HashSet<>();
    
    //Puis on va ajouter de quoi lire et modifier cet attribut en utilisant "Insert Code" pour ajouter "Getter et Setter"

    public Set<Work> getItems() {
        return items;
    }

    public void setItems(Set<Work> items) {
        this.items = items;
    }
    
}
