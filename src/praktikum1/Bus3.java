/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author WINDOWS 10
 */
public class Bus3 {
     public double penumpang;
    public double maxpenumpang;
    public double penumpangbaru;
    public double ratarata;
   public int counter=0;
    
    public Bus3(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //method mutator
    public void addpenumpang(double penumpang) {
        double temp;
       temp=this.penumpang+penumpang;
       if(temp>maxpenumpang) {
           System.out.println("berat badan penumpang Melebihi kuota");
       }else{
           this.penumpang = temp;
       }
       counter++;
    }
    public void getpenumpang(int password) {
        if(password==24){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
        
            
    }
    public void getAverage(){
        ratarata = this.penumpang/counter;
    }
    public void cetakpenumpang() {
        System.out.println(" berat Penumpang bus sekarang : " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah : " + maxpenumpang);
        System.out.println("rata-rata berat badan penumpang : " + ratarata);
    }
    
}
 