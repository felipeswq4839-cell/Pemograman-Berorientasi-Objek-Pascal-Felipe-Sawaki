/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B.One;

/**
 *
 * @author Pascal Felipe Sawaki
 */
public class MainStudent {
    public static void main(String[] args) {

        StudentGrade mhs = new StudentGrade("22123456", "Budi Santoso");

        mhs.setNilaiKuis(80.0);
        mhs.setNilaiUTS(90.0);

        mhs.cetakLaporan();

        System.out.println("");
        System.out.println("=-= Uji Validasi Input Salah =-=");
        mhs.setNilaiKuis(150.0);
        mhs.setNilaiUTS(-20.0);

        System.out.println("");
        System.out.println("=-= Data Read-Only =-=");
        System.out.println("NIM  : " + mhs.getNim());
        System.out.println("Nama : " + mhs.getNama());
        System.out.println("Grade: " + mhs.getGradeHuruf());

        System.out.println("");
        System.out.println("=-= Set Nilai Baru (50, 60) =-=");
        mhs.setNilaiKuis(50.0);
        mhs.setNilaiUTS(60.0);
        mhs.cetakLaporan();
    }
}
