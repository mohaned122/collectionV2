/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td_collection;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author zayoud_mohanned
 */
public class annuaire {
    public TreeMap<String,String> map;

    public annuaire(TreeMap<String, String> map) {
        this.map = map;
    }

    public annuaire() {
        this.map = new TreeMap<String,String>();
    }
   //return le nemuro de de personne selon le leur nom 
    public String getNumero(String nom){
        return this.map.get(nom);
    }
    
    //ajout neveau compte dans l'annuaire
    public void  ajouterNumero(String nom, String num){
        try{
            Integer x = Integer.parseInt(num);
            this.map.put(nom, x.toString());
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
    
    //afficher toute l'annuaire
    public void affiche(){
        Iterator it = this.map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry mapentry = (Map.Entry) it.next();
            System.out.println(mapentry.getKey()+":"+mapentry.getValue());
        }
    }
    
    public static void main(String[] args){
        annuaire a = new annuaire();
        a.ajouterNumero("mohanned", "90045069");
        a.ajouterNumero("ali", "75008002");
        a.ajouterNumero("jj", "25802088");
        a.affiche();
        System.out.println("************************************");
        System.out.println(a.getNumero("ali"));
    }
}
