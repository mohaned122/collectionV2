/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td_collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.*;

/**
 *
 * @author zayoud_mohanned
 */
public class L2Vector implements unversity {
    Vector<Etudiant> l2Vector;

    public L2Vector() {
        this.l2Vector = new Vector<Etudiant>() ;
    }

    public Vector<Etudiant> getL2Vector() {
        return l2Vector;
    }
    
    
    
    @Override
    public void ajouterEtudiant(Etudiant e) {
        l2Vector.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
    return l2Vector.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        Iterator it = l2Vector.iterator();
        while(it.hasNext()){
            Etudiant e = (Etudiant) it.next();
            if(e.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
      Iterator it = l2Vector.iterator();
        while(it.hasNext()){
            Etudiant y = (Etudiant) it.next();
            if(y.equals(e)){
                it.remove();
            }
        }
    }

    @Override
    public void afficherEtudiants() {
        //l2Vector.toString();
        for(Etudiant e: l2Vector){
            System.out.println(e.toString());
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(l2Vector);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(l2Vector,new Etudiant());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.l2Vector);
        return hash;
    }
    
}
