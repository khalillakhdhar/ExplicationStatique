/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.explicationstatique;

/**
 *
 * @author khali
 */
public class Etudiants {
    public static int id=0;
    private String nom,prenom,groupe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    @Override
    public String toString() {
        return "Etudiants{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", groupe=" + groupe + '}';
    }

   

    public Etudiants(String nom, String prenom, String groupe) {
        Etudiants.id++;
        this.nom = nom;
        this.prenom = prenom;
        this.groupe = groupe;
    }
    
    
    
    
}
