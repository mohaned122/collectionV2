/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td_collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author zayoud_mohanned
 */
public class L2HashSet implements unversity{
    HashSet<Etudiant> L2HashSet ;

    public L2HashSet(List<Etudiant> L) {
        this.L2HashSet = new HashSet<Etudiant>();
        this.L2HashSet.addAll(L);
    }

    public L2HashSet() {
        this.L2HashSet = new HashSet<Etudiant>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        this.L2HashSet.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
       return this.L2HashSet.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
       for(Etudiant e: L2HashSet){
        if(nom.equalsIgnoreCase(e.getNom())){
            return true;
        }
    }
       return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
         Iterator it = L2HashSet.iterator();
        while(it.hasNext()){
            Etudiant y = (Etudiant)it.next();
            if(y.equals(e)){
                it.remove();
            }
        }
    }

    @Override
    public void afficherEtudiants() {
        L2HashSet.toString();
    }

    @Override
    public void trierEtudiantsParId() {
        L2ArrayList le = new L2ArrayList((List<Etudiant>) this.L2HashSet);
        le.trierEtudiantsParId();
        this.L2HashSet.clear();
        this.L2HashSet.addAll(le.getL2ArrayList());
    }

    @Override
    public void trierEtudiantsParNom() {
        L2ArrayList le = new L2ArrayList((List<Etudiant>) this.L2HashSet);
        le.trierEtudiantsParNom();
        this.L2HashSet.clear();
        this.L2HashSet.addAll(le.getL2ArrayList());
    }
    
    
}
