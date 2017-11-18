/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;


public abstract class Employe {  
   public String Nom;
   public String Prenom;
   public int Age;
   public int Date;
   public String Matricule;
   
   
 public Employe( String N , String P, int D ,String M,int A ){
   Nom = N;
   Prenom = P;
   Matricule = M;
   Date = D;
   Age = A;
 }
  public abstract double calculSalaire();
  
  public String getTypeEm(){
      return "L'employe:";
  }
   public String  getNom(){
     return getTypeEm()+ Nom +" " +Prenom;

 }
}  
  
  
