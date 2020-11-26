/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 汴雪
 */
public class Palabra {
    
    private ArrayList palabras;
    private char[] key;
    
    
    public Palabra() {
        palabras = new ArrayList();
        palabras.add("aguila");
        palabras.add("elefante");
        palabras.add("escarabajo");
        palabras.add("cocodrilo");
        palabras.add("saltamontes");
        palabras.add("tigre");
        palabras.add("osobanda");
        palabras.add("hormiga");
        palabras.add("leopardo");
        palabras.add("Serpiente");
        
        int n = (int) (Math.random()*10+1);
        String p = (String) palabras.get(n);
        key = p.toCharArray();
    }
    
    public char[] getKey() {
        return key;
    }
    
}
