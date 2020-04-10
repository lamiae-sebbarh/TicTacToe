/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX2;

/**
 *
 * @author pc
 */
public class AgentArbitre {
     public static boolean GameOver(char[][] matrice){
        boolean a= true;
        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[i].length; j++){
                if (matrice[i][j]=='-'){
                   a= false;
                }}}
        return a;
        }
      public  static void Affichage(char[][] matrice){
        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[i].length; j++){
                System.out.print(matrice[i][j] + " | ");
            }
            System.out.println();
        
        }
    
}
     public static boolean Gagner(char[][] matrice, char symbole) {
        boolean colonne=false; 
         boolean result=false; 
        boolean ligne=false;
        boolean diagonaldroite=false;
        boolean diagonalgauche=false;
        for(int i = 0; i < matrice.length; i++){
            if(matrice[i][0]==symbole && matrice[i][1]==symbole && matrice[i][2]==symbole){
                ligne=true;}}
        
        for(int j = 0; j < matrice.length; j++){
            if(matrice[0][j]==symbole && matrice[1][j]==symbole && matrice[2][j]==symbole){
                colonne=true;}}
        
       
        if(matrice[0][0]==symbole && matrice[1][1]==symbole && matrice[2][2]==symbole){
            diagonaldroite=true;}
       
        if(matrice[0][2]==symbole && matrice[1][1]==symbole && matrice[2][0]==symbole){
            diagonalgauche=true;}
        
        if((colonne==true) || (ligne==true) || ( diagonaldroite==true) ||(diagonalgauche==true))
            result= true;
        return result;
    }
     
     
     
     public static void Partie(int t , char[][] matrice, AgentJoueur J1,AgentJoueur J2){
         ///tour
            if (t%2 == 0){
                J1.Jouer(matrice);
                System.out.println("c'est le tour de "+J1.symbole);
            }else{
                J2.Jouer(matrice);
                System.out.println("c'est le tour de "+J2.symbole);}}

     
     public static void Resultat(char[][] matrice){
        if(Gagner(matrice,'X')==true ){
         System.out.println("le gagnant est X");}
        if(Gagner( matrice,'O')==true ){
         System.out.println("le gagnant est O");
    }if(Gagner( matrice,'O')==false && Gagner( matrice,'X')==false ){
        System.out.println("match null");
             }
    }}

