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
public class banque {
    private static int i = 0;
    private TreeMap<Integer,compte> map;
    private String nom;

    public banque(String nom) {
        this.map = new TreeMap<Integer,compte>();
        this.nom = nom;
    }

    public banque() {
        this.map = new TreeMap<Integer,compte>();
        this.nom = "inconnu";
    }
    
    public void creerCompte(double init){
        compte c = new compte(init);
        map.put(i++, c);
    }
    
    public boolean isNumCompte(int n){
        return map.containsKey(n);
    }
    
    public boolean depot(int num, double m){
        if(isNumCompte(num)){
            //compte c = new compte(map.get(num).getSold()+m);
            compte c = map.get(num);
            c.ajoutSold(m);
            map.put(num, c);
            return true;
        }
        return false;
    }
    
    public boolean virerVers(double m, int numS, int numD, banque b){
        if(this.isNumCompte(numS) && b.isNumCompte(numD)){
            compte c1=map.get(numS);
            c1.retraitSold(m);
            this.map.put(numS, c1);
           // b.depot(numD, m);en un seul ligne en fait ça
            compte c2=b.map.get(numD);
            c2.ajoutSold(m);
            b.map.put(numD, c2);
        }
        return false;
    }
    
    public boolean virerVers(double m, int numS, int numD){
         return virerVers(m,numS,numD, this);
    }
    
    private compte getCompteDeNum(int n){
        return this.map.get(n);
    }
    
    public double getSoldeTous(){
        double tous =0;
        for(Map.Entry mapentry :map.entrySet()){
            compte c = (compte) mapentry.getValue();
            tous += c.getSold();
        }
        return tous;
    }
    
    public void supprimerNull(){
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
           Map.Entry mapentry = (Map.Entry) it.next();
           compte c = (compte) mapentry.getValue();
           if(c.getSold() == 0){
               it.remove();
           }
        }
    }
    public static void main(String arg[]){
        banque atb = new banque("ATB");
        banque bh = new banque("bh");
        
        atb.creerCompte(2000);//0
        atb.creerCompte(1000);
        
        bh.creerCompte(500);//0
        bh.creerCompte(100);
        
       atb.virerVers(400, 0, 2,bh);
        
        System.out.println("atb :"+atb.map);
        System.out.println("bh"+bh.map);
        
    }
}
