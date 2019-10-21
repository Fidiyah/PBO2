/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author asd
 */
public class UjiBus {
    public static void main(String[] args) {
        //membuat objek dari kelas bus
       bus busMini = new bus();
       //masukkan nilai jumblah penumpang dan penumpang maksimal ke
       //dalam objek busMini
       busMini.penumpang=5;
       busMini.maxpenumpang =15;
       //memanggil method cetak pada kelas Bus
       busMini.cetak();
       
       //menambahkan penumpang pada busmini
       busMini.penumpang=busMini.penumpang+5;
       busMini.cetak();
       //mengurangi penumpang pada busmini
       busMini.penumpang=busMini.penumpang-2;
       busMini.cetak();
       //menambahkan jumlah penumpang pada busmini
        busMini.penumpang=busMini.penumpang+3;
       busMini.cetak();
       
    }
    
}

