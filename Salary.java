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
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Personnel p=new Personnel();
        p.ajouterEmploye (new Production("SIKOUONG","MICH",1997,"13G573",13,27));
        p.ajouterEmploye (new Manutention ("NGEUGANG","PAUL",1980,"13D53",27,23));
        p.ajouterEmploye (new VendeurCommercial ("MAWEKAM","GAELLE",1980,"13A473",13));
        p.ajouterEmploye (new Manutentionnaire("EMEBOLIE","MOHAMMED",1890,"13B473",13,70));
        p.ajouterEmploye (new Producteur("NGEUKO","AICHA",1990,"13B483",19,60));
        p.ajouterEmploye(new RepresantantCommercial("SIME","VIRGILE",1987,"17B739",40)); 
        
        
        p.afficherSalaire();
        System.out.println("le salaire moyen est "+p.salaireMoyen()+" franc cfa ");
    }
    
}

    
    

