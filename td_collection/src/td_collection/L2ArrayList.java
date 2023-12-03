/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author zayoud_mohanned
 */
public class L2ArrayList implements unversity{

    List<Etudiant> L2ArrayList;

    public L2ArrayList() {
        this.L2ArrayList = new ArrayList<Etudiant>();
    }
    
    public L2ArrayList(List<Etudiant> le) {
        this.L2ArrayList = new ArrayList<Etudiant>();
        L2ArrayList.addAll(le);
    }

    public List<Etudiant> getL2ArrayList() {
        return L2ArrayList;
    }
    
    @Override
    public void ajouterEtudiant(Etudiant e) {
        this.L2ArrayList.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return L2ArrayList.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for(Etudiant e: L2ArrayList){
            if(e.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        Iterator it = L2ArrayList.iterator();
        while(it.hasNext()){
            Etudiant y = (Etudiant)it.next();
            if(y.equals(e)){
                it.remove();
            }
        }
    }

    @Override
    public void afficherEtudiants() {
        System.out.println(L2ArrayList.toString());
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(L2ArrayList);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(L2ArrayList,new Etudiant());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.L2ArrayList);
        return hash;
    }

}
