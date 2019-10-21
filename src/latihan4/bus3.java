/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author WINDOWS 10
 */
public class bus3 {
    public int penumpang;
    public int maxpenumpang;
    
    public bus3(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //method mutator
    public void addpenumpang(int penumpang) {
        int temp;
       temp=this.penumpang+penumpang;
       if(temp>maxpenumpang) {
           System.out.println("penumpang Melebihi kuota");
       }else{
           this.penumpang = temp;
       }
    }
    public void getpenumpang(int password) {
        if(password==24){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
            
    }
    public void cetakpenumpang() {
        System.out.println("Penumpang bus sekarang : " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah : " + maxpenumpang);
    }
    
    }
            
    

