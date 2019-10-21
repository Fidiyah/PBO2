/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author WINDOWS 10
 */
public class Bola {
   private double jarijari;
   public void setjarijari(double jarijari){
       this.jarijari =jarijari;
   }
   public void showdiameter(){
       System.out.println("Diameter : "+ 2*jarijari);
   }
   public void showluaspermukaan(){
       System.out.println("Luas permukaan : "+ Math.PI *jarijari*jarijari*4);
   }
   public void showvolume(){
       System.out.println("Volume : " + Math.PI *jarijari*jarijari*jarijari*4/3);
       
       
   }

    

}

