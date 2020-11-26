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
public class Juego {
    
    private int vida;
    
    public Juego(){
        vida=6;
    }
    
    public int getVida() {
        return this.vida;
    }
    
    public void setVida(int v) {
        this.vida = v;
    }
    
    public ArrayList<Integer> Play(char lJugador, char[] key) {
        
        ArrayList<Integer> posicion = new ArrayList<>();
        int i = 0;
        
        while(i < key.length) {
            int j = 0;
            if(key[i] == lJugador) {
                posicion.add(i);
                j++;
            }
            i++;
        }
        
        if(posicion.isEmpty()) {
            vida--;
        }
        return posicion;
    }
}
