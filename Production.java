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
public  class Production extends Employe {
    int nombreUnites;
public Production(String N, String P, int D, String M, int nombreUnite,int A) {
      super(N, P, D, M, A);
      nombreUnites = nombreUnite;
    }

 public String getTypeEm(){
      return "Production : ";
  }

    @Override
    public double calculSalaire() {
     return 110000.0+nombreUnites *5.0;
    }
     
     
    }