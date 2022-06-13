/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklsemester2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pandu Putrakelana G
 */
public class Peminjaman {

    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
//    private ArrayList<Integer> idPetugas = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();

    public Peminjaman() {
        //Transaksi 1
        this.idSiswa.add(0);
        this.idBuku.add(2);
        this.banyak.add(2);
        //Transaksi 2
        this.idSiswa.add(1);
        this.idBuku.add(0);
        this.banyak.add(2);
        //Transaksi 3
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(2);
        //Transaksi 4
        this.idSiswa.add(3);
        this.idBuku.add(1);
        this.banyak.add(2);
    }

    public void prosesTransaksi(Siswa siswa, Peminjaman peminjaman, Buku buku) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Silahkan Meminjam");
        System.out.print("Masukkan ID Siswa : ");
        int idSiswa = scan.nextInt();
        System.out.println("Selamat Datang " + siswa.getNama(idSiswa));
        System.out.println("-----Silahkan Memilih Buku-----");
        System.out.println("     0 - Michael Kerdon");
        System.out.println("     1 - Bruce Chanszz");
        System.out.println("     2 - Home A While");
        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        if (siswa.getStatus(idSiswa) == false) {
            System.out.println("Tidak Bisa Pinjam");
        } else {
            do {
                System.out.print("Masukkan Kode Buku : ");
                temp = scan.nextInt();
                if (temp != 99) {
                    idBuku.add(temp);
                    System.out.print(buku.getNamaBuku(idBuku.get(i)) + " Sebanyak : ");
                    banyak.add(scan.nextInt());
                    i++;
                }
            } while (temp != 99);

            System.out.println("Transaksi Belanja " + siswa.getNama(idSiswa) + " Sebagai Berikut");
            System.out.println("Nama Barang \tQty \tHarga \tJumlah ");

            int total = 0;
            int x = idBuku.size();
            for (int j = 0; j < x; j++) {
                int jumlah = banyak.get(j) * buku.getHarga(idBuku.get(j));
                total += jumlah;
                System.out.println(buku.getNamaBuku(idBuku.get(j)) + "\t" + "\t" + banyak.get(j) + "\t" + buku.getHarga(idBuku.get(j)) + "\t" + jumlah);
                peminjaman.setPeminjaman(buku, idSiswa, idBuku.get(j), banyak.get(j));
            }
            System.out.println("Total Belanja : " + total);
            siswa.editStatus(idSiswa, false);

        }

    }

    public void setPeminjaman(Buku buku, int idSiswa, int idBuku, int banyaknya) {
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku) - banyaknya);
    }

    public int getIdBuku(int idBuku) {
        return this.idBuku.get(idBuku);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdMember(int id) {
        return this.idSiswa.get(id);
    }

    public int getJmlPeminjaman() {
        return this.idSiswa.size();
    }
}
