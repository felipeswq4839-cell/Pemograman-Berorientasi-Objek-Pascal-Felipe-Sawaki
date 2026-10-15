/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B.One;

/**
 *
 * @author Pascal Felipe Sawaki
 */
public class StudentGrade {

    private final String nim;
    private final String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf;

    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0.0;
        this.nilaiUTS = 0.0;
        this.gradeHuruf = "E";
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getNilaiKuis() {
        return nilaiKuis;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public String getGradeHuruf() {
        return gradeHuruf;
    }

    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis < 0.0 || nilaiKuis > 100.0) {
            System.out.println("ERROR: Nilai kuis harus antara 0.0 - 100.0. "
                    + "Input '" + nilaiKuis + "' ditolak.");
            return;
        }
        this.nilaiKuis = nilaiKuis;
        hitungGradeHuruf();
    }

    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS < 0.0 || nilaiUTS > 100.0) {
            System.out.println("ERROR: Nilai UTS harus antara 0.0 - 100.0. "
                    + "Input '" + nilaiUTS + "' ditolak.");
            return;
        }
        this.nilaiUTS = nilaiUTS;
        hitungGradeHuruf();
    }

    public double hitungNilaiAkhir() {
        return (0.40 * nilaiKuis) + (0.60 * nilaiUTS);
    }

    private void hitungGradeHuruf() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 85.0) {
            this.gradeHuruf = "A";
        } else if (nilaiAkhir >= 75.0) {
            this.gradeHuruf = "B";
        } else if (nilaiAkhir >= 65.0) {
            this.gradeHuruf = "C";
        } else if (nilaiAkhir >= 50.0) {
            this.gradeHuruf = "D";
        } else {
            this.gradeHuruf = "E";
        }
    }

    public void cetakLaporan() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println( "LAPORAN HASIL STUDI ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Kuis   : " + nilaiKuis);
        System.out.println("Nilai UTS    : " + nilaiUTS);
        System.out.println("Nilai Akhir  : " + String.format("%.2f", hitungNilaiAkhir()));
        System.out.println("Grade Huruf  : " + gradeHuruf);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
    }
}


