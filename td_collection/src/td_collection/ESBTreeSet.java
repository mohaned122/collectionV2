/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td_collection;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author zayoud_mohanned
 */
public class ESBTreeSet implements unversity{
    public TreeSet<Etudiant> ESBTreeSet;

    public ESBTreeSet(List<Etudiant> ESBTreeSet) {
        this.ESBTreeSet = new TreeSet<Etudiant>();
        this.ESBTreeSet.addAll(ESBTreeSet);
    }

    public ESBTreeSet() {
        this.ESBTreeSet = new TreeSet<Etudiant>();
    }
    
    @Override
    public void ajouterEtudiant(Etudiant e) {
        this.ESBTreeSet.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
       return this.ESBTreeSet.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
         for(Etudiant e: this.ESBTreeSet){
        if(nom.equalsIgnoreCase(e.getNom())){
            return true;
        }
    }
       return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
         Iterator it = this.ESBTreeSet.iterator();
        while(it.hasNext()){
            Etudiant y = (Etudiant)it.next();
            if(y.equals(e)){
                it.remove();
            }
        }
    }

    @Override
    public void afficherEtudiants() {
        System.out.println(this.ESBTreeSet.toString());
    }

    @Override
    public void trierEtudiantsParId() {
        System.out.println("le tree set est déja tree par id");
    }

    @Override
    public void trierEtudiantsParNom() {
        trierEtudiantsParId();
    }
    
}
