/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B.Two;

/**
 *
 * @author Pascal Felipe Sawaki
 */
// SmartAC: implement Switchable + Connectable
public class SmartAC implements Switchable, Connectable {

    private boolean isOn;         // status sakelar
    private int temperature;      // suhu derajat Celsius
    private String ssid;          // nama WiFi terhubung
    private String ipAddress;     // IP perangkat

    public SmartAC() {
        this.isOn = false;
        this.temperature = 24;    // default suhu
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("[SmartAC] Dinyalakan. Suhu: " + temperature + " C");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[SmartAC] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // validasi state: tidak boleh connect kalau mati
        if (!isOn) {
            System.out.println("[SmartAC] ERROR: Tidak bisa connect WiFi, perangkat masih mati.");
            return;
        }
        this.ssid = ssid;
        this.ipAddress = ipAddress;
        System.out.println("[SmartAC] Terhubung ke WiFi '" + ssid + "' dengan IP " + ipAddress);
    }
}