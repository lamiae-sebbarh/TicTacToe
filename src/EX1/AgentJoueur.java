/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

import java.util.Random;

/**
 *
 * @author pc
 */
public class AgentJoueur {
      char symbole;
    int h;

    public AgentJoueur() {
    }
    public AgentJoueur(char symbole) {
        this.symbole=symbole;
    }

    public char getSymbole() {
        return symbole;
    }

    public void setSymbole(char symbole) {
        this.symbole = symbole;
    }

    
    public  void Jouer(char[][] matrice) {
      int a,b;
        Random rand = new Random(); 
       do{ 
        a= rand.nextInt((2 - 0) + 1) + 0;
        b= rand.nextInt((2 - 0) + 1) + 0;
       }
       while(matrice[a][b]!='-');
       matrice[a][b]= this.symbole;
        } 
       }
    
