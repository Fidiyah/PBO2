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
public class ujibus3 {
    public static void main(String[] args) {
        Bus3 bus = new Bus3(500);
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetakpenumpang();
        
        bus.addpenumpang(25);
        bus.getAverage();
        bus.cetakpenumpang();
        
        bus.addpenumpang(32);
        bus.getAverage();
        bus.cetakpenumpang();
        
        bus.addpenumpang(10); 
        bus.getAverage();
        bus.cetakpenumpang();
      
        bus.addpenumpang(15); 
        bus.getAverage();
        bus.cetakpenumpang();
        
        
    }
    
}
