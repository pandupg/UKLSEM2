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
public class Laporan {

    public void laporan(Buku buku) {
        int x = buku.getJmlBuku();

        System.out.println();
        System.out.println("Tabel Buku");
        System.out.println();
        System.out.println("Nama Barang \tStok \tHarga");
        for (int i = 0; i < x; i++) {
            System.out.println(buku.getNamaBuku(i) + "\t" + buku.getStok(i) + "\t" + buku.getHarga(i));
        }
    }

    public void laporan(Siswa siswa) {
        int x = siswa.getJmlSiswa();

        System.out.println();
        System.out.println("Tabel Siswa");
        System.out.println();
        System.out.println("Nama \tAlamat \tTelepon \t\tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(siswa.getNama(i) + "\t" + siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getStatus(i));
        }
    }

    public void laporan(Peminjaman peminjaman, Buku buku) {
        int x = peminjaman.getJmlPeminjaman();

        System.out.println();
        System.out.println("Laporan Pinjaman");
        System.out.println();
        System.out.println("Nama Barang \tQty \tHarga \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = peminjaman.getBanyaknya(i) * buku.getHarga(peminjaman.getIdBuku(i));
            total += jumlah;
            System.out.println(buku.getNamaBuku(peminjaman.getIdBuku(i))  + "\t" + peminjaman.getBanyaknya(i) + "\t" + buku.getHarga(peminjaman.getIdBuku(i)) + "\t" + jumlah);
        }
        System.out.println("Total Omset : " + total);
    }

    public void laporan(Petugas petugas) {
        int x = petugas.getJmlPetugas();

        System.out.println();
        System.out.println("Tabel Petugas");
        System.out.println();
        System.out.println("Nama \tAlamat \tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(petugas.getNama(i) + "\t" + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i) + "\t");
        }
    }

}
