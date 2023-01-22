/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.explicationstatique;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khali
 */
public class Groupe {
    public static  List<Etudiants> ls=new ArrayList<Etudiants>();
    public static void showList()
    {
    for(Etudiants e:ls)
    {
        System.out.println(e.toString());
    
    }
    
    }
}
