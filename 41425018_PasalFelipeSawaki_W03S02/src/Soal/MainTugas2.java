/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal;

/**
 *
 * @author Pascal Felipe Sawaki
 */
public class MainTugas2 {
    public static void main(String[] args) {
        MahasiswaAktif m = new MahasiswaAktif();
        m.nama = "Dina";
        m.nim = "123456";
        m.semester = 5;

        System.out.println("Nama: " + m.nama);
        System.out.println("NIM: " + m.nim);
        m.belajar();
    }
}