/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td_collection;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author zayoud_mohanned
 */
public class Etudiant implements Comparable,Comparator{
    private int id;
    private String nom;
    private String prenom;
    private Date dn;
    private String cin;

    public Etudiant() {
        this.id = 0;
        this.nom = "inconnu";
        this.prenom = "inconu";
        this.dn = new Date();
        this.cin = "00000000";
    }
    
    public Etudiant(int id, String nom, String prenom, Date dn, String cin) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dn = dn;
        this.cin = cin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDn() {
        return dn;
    }

    public void setDn(Date dn) {
        this.dn = dn;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
    
    public int getAge(){
        Date today = new Date();
        int age = today.getYear() - dn.getYear();
        return age;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cin, other.cin)) {
            return false;
        }
        return Objects.equals(this.dn, other.dn);
    }

    @Override
    public String toString() {
        return "Etudiant :\nid:" + id + ",\nnom:" +nom + ",\nprenom:" + prenom + ",\ndate de naissance:" + dn.toString() + "\ncin:" + cin+"\n----------------------\n" ;
    }
    
    @Override
    public int compareTo(Object o) {
        Etudiant e = (Etudiant)o;
        return this.id - e.id;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Etudiant e1 = (Etudiant)o1;
        Etudiant e2 = (Etudiant)o2;
        return e1.nom.compareTo(e2.nom);
    }
}
