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
public   class Manutentionnaire extends Employe implements Dangereux {
          int nombreHeure;
    public Manutentionnaire(String N, String P, int D, String M, int A,int nbr) {
        super(N, P, D, M, A);
           nombreHeure= nbr;   
      
    }
    
          @Override
     public String getTypeEm(){
      return "Manutentionnare : ";
  }
          @Override
    public double calculSalaire(){
        return 110000.0+nombreHeure*65.0;
    }

    public double prime (Manutentionnaire e) {
     return  (e.calculSalaire()+prime);
             
    }
    

   
    
}
