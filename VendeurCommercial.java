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
public  class VendeurCommercial extends Employe {
       int chiffreAffaire;
       
    public VendeurCommercial(String N, String P, int D, String M, int A) {
        super(N, P, D, M, A);
    }
    
     public String getTypeEm(){
      return "VendeurCommercial : ";
  }

    @Override
    public double calculSalaire() {
        double salaire = (chiffreAffaire * 0.2) +110000.0+100.0;
        return salaire;
    }
    
}
