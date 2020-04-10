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
public class ProgrammePrincipal {
     public static void main(String[] args){
     char[][] matrice = new char[3][3];
     for(int i = 0; i < 3; i++)
     for(int j = 0; j < 3; j++)
        matrice[i][j] = '-';
        ///Affichage(matrice);
        ///GameOver(matrice);
      AgentArbitre.Affichage(matrice);
      AgentJoueur J1 =new AgentJoueur('X');
      AgentJoueur J2 =new AgentJoueur('O');
      AgentArbitre Ar =new AgentArbitre();
      
      ///Ar.Affichage(matrice);NON 
    //  Ar.Partie(true, matrice, J1, J2); NON
      
       ////System.out.println(AgentArbitre.GameOver(matrice));pour verifier l existance de erreur 
      ////System.out.println( AgentArbitre.Gagner(matrice, J1.symbole)); psq le while ne marche pas
      char symbolIn='X';
      int t=1;
            while(AgentArbitre.GameOver(matrice)==false && AgentArbitre.Gagner(matrice, J1.symbole)==false && AgentArbitre.Gagner(matrice, J2.symbole)==false)
            {
                AgentArbitre.Partie(t, matrice, J1, J2);
                AgentArbitre.Affichage(matrice);
                System.out.println();
                t++;
//                    if (symbolIn=='X'){
//                    J1.Jouer(matrice);
//                    symbolIn='O';   mm logique que partie 
//                    }else{
//                    J2.Jouer(matrice);
//                    symbolIn='X';}
//                         
       }
           AgentArbitre.Resultat(matrice);
  
    }}
     
     

