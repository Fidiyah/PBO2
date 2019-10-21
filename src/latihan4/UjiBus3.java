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
public class UjiBus3 {
    public static void main(String[] abc) {
        bus3 bus = new bus3(5);
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang(2); //menambah 2 penumpang
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang(1); //menambah 1 penumpang
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang(2); //menambah 1 penumpang
        bus.cetakpenumpang();
        //penambahan penumpang
        bus.addpenumpang(2); // menambah 2 penumpang
        bus.cetakpenumpang();
        
        
        
        
    }
    
}
