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
public abstract class Commercial extends Employe {
    int chiffreAffaire;
    public Commercial(String N, String P, int D, String M, int A,int CA) {
        super(N, P, D, M, A);
    chiffreAffaire = CA;
    }
    
     public String getTypeEm(){
      return "Commercial : ";
  }

    @Override
    public double calculSalaire() {
    double salaire = (chiffreAffaire*0.2)+110000.0+200.0;
        return salaire;
    }
}   

