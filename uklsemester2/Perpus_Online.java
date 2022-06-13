/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklsemester2;

/**
 *
 * @author Pandu Putrakelana G
 */
public class Perpus_Online  {

    public static void main(String[] args) {
        Siswa m = new Siswa();
        Petugas k = new Petugas();
        Buku b = new Buku();
        Peminjaman t = new Peminjaman();
        Laporan l = new Laporan();
        
        l.laporan(b);
        l.laporan(m);
        l.laporan(k);
        l.laporan(t, b);
        t.prosesTransaksi(m, t, b);
        t.prosesTransaksi(m, t, b);
        
        l.laporan(t, b);
        l.laporan(b);
        l.laporan(m);
        

    }

}
