/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.explicationstatique;

/**
 *
 * @author khali
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Etudiants e1=new Etudiants("ali", "younes", "LFSI1");
        System.out.println("id="+Etudiants.id);
        Etudiants e2=new Etudiants("ahmed", "youcef", "LFSI3");
        System.out.println("id="+Etudiants.id);
        Groupe.ls.add(e1);
        Groupe.ls.add(e2);
        Groupe.showList();

    }
    
}
