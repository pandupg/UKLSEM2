/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklsemester2;

import java.util.ArrayList;

/**
 *
 * @author Pandu Putrakelana G
 */
public class Petugas implements User {

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    //Konstruktor
    public Petugas() {
        //Siswa 1
        this.namaPetugas.add("Radya");
        this.alamat.add("Malang");
        this.telepon.add("085200000006");

        //Siswa 2
        this.namaPetugas.add("Anca");
        this.alamat.add("Malang");
        this.telepon.add("085200000007");

        //Siswa 3
        this.namaPetugas.add("Adit");
        this.alamat.add("Malang");
        this.telepon.add("085200000008");

    }

    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }

    public int getJmlPetugas() {
        return this.namaPetugas.size();
    }

}
