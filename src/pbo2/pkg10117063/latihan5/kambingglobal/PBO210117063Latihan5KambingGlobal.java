/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan5.kambingglobal;

/**
 *
 * @author DEADPOOL
 *NAMA : Cessario
 *NIM : 10117063
 *KELAS : IF-2
 *Deskripsi Program : menampilkan jumlah kambing setelah ditambah */
public class PBO210117063Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    //Variabel jumlahkambing menjadi variabel instance
     int jumlahKambing = 88;
     
    // Method untuk menampilkan jumlah kaming
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5 ;
        System.out.println("Jumlah Kambing setelah ditambah: " +
                           jumlahKambing );
        
    }
    public static void main(String[] args) {
        PBO210117063Latihan5KambingGlobal kambingSusu = new
                            PBO210117063Latihan5KambingGlobal();
        
 //Menampilakan jumlah kambing kambing yang ada saat progress pertama x berjalan
        kambingSusu.getJumlahKambing();
 // Menambah satu kambing
        kambingSusu.tambahKambing();
 // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
