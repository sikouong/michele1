/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author michelle
 */
public  class Producteur extends Production implements Dangereux {
      int nombreUnite;
    public Producteur(String N, String P, int D, String M, int A,int nbr ) {
        super(N, P, D, M, A,nbr);
       
    }
    
     public String getTypeEm(){
      return "Producteur : ";
  }
      @Override
    public double calculSalaire(){
        return nombreUnite*5.0+110000.0;
    }
    
    public double prime (Producteur p){
      return p.calculSalaire()+prime;
}

   
}