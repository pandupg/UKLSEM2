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
public class Siswa implements User {

    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    //Konstruktor
    public Siswa() {
        //Siswa 1
        this.namaSiswa.add("Pandu");
        this.alamat.add("Malang");
        this.telepon.add("085200000000");
        this.status.add(true);
        //Siswa 2
        this.namaSiswa.add("Fariz");
        this.alamat.add("Malang");
        this.telepon.add("085200000001");
        this.status.add(true);
        //Siswa 3
        this.namaSiswa.add("Hilmy");
        this.alamat.add("Malang");
        this.telepon.add("085200000002");
        this.status.add(true);
        //Siswa 4
        this.namaSiswa.add("Dimas");
        this.alamat.add("Malang");
        this.telepon.add("085200000003");
        this.status.add(true);
        //Siswa 5
        this.namaSiswa.add("Angga");
        this.alamat.add("Malang");
        this.telepon.add("085200000004");
        this.status.add(true);
    }

    @Override
    public void setNama(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);

    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    public void setStatus(Boolean status) {
        this.status.add(status);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    public boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    }

    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }
    
    public void editStatus(int idSiswa,boolean status){
        this.status.set(idSiswa, status);
    }
    
    public int getJmlSiswa() {
        return this.status.size();
    }

}
