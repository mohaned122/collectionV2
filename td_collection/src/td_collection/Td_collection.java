/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package td_collection;

import java.util.Date;
import java.util.List;

/**
 *
 * @author zayoud_mohanned
 */
public class Td_collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date toDay = new Date();
        Etudiant e1 = new Etudiant();
        Etudiant e2 = new Etudiant(9, "mhanned", "zayoud",toDay, "13503221");
        Etudiant e3 = new Etudiant(7, "aohannedi", "ztyoud",toDay, "13503227");
        Etudiant e4 = new Etudiant(3, "bohalned", "zapoud",toDay, "13503421");
        
        L2Vector lc = new L2Vector();
        lc.ajouterEtudiant(e1);
        lc.ajouterEtudiant(e2);
        lc.ajouterEtudiant(e3);
        lc.ajouterEtudiant(e4);
        lc.afficherEtudiants();
        System.out.println("---------------------------------------------");
        lc.trierEtudiantsParNom();
        lc.afficherEtudiants();
        System.out.println("****************************ArrayListe******************************");
        L2ArrayList le = new L2ArrayList((List<Etudiant>) lc.getL2Vector());
        le.trierEtudiantsParId();
        le.supprimerEtudiant(e4);
        le.afficherEtudiants();
        System.out.println("****************************hashSet******************************");
    }
    
}
