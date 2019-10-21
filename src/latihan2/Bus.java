/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author asd
 */
public class Bus {
     public int penumpang;
   public int maxpenumpang;
   //konstruktor kelas bus
   public Bus(int maxpenumpang) {
       this.maxpenumpang=maxpenumpang;
       penumpang=0;
   }

    
   //method mutator untuk menambahkan penumpang
   public void addPenumpang(int penumpang) {
       int temp;
       temp = this.penumpang+penumpang;
       if(temp>=maxpenumpang){
           System.out.println("penumpang melebihi kuota");
       }else{
           this.penumpang=temp;
       }
   }
   
   
   public void cetak(){
       System.out.println("Penumpang bus sekarang adalah : "+penumpang); 
       System.out.println("Jumlah penumpang maksimal adalah : " +maxpenumpang);
   }
   
    
    
}
