/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td_collection;

/**
 *
 * @author zayoud_mohanned
 */
public class compte implements Comparable{
    
    public static int i = 0;
    private int nemuro;
    private double sold;

    public compte(double sold) {
        this.nemuro = i++;
        this.sold = sold;
    }

    public compte() {
        this.nemuro = i++;
        this.sold = 0;
    }
    
    public int getNemuro() {
        return nemuro;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }
    
    public void ajoutSold(double monttant){
        this.sold +=monttant;
    }
    
    public void retraitSold(double manttant){
        if(sold>=manttant)
            this.sold -=manttant;
        else
        {
            System.out.println("retrait impossible");
        }
    }

    @Override
    public int compareTo(Object o) {
        compte c = (compte)o;
        return (int)(this.sold - c.sold);
    }

    @Override
    public String toString() {
        return "compte{" + "nemuro=" + nemuro + ", sold=" + sold + '}';
    }
}
