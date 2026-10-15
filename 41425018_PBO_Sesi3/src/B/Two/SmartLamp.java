/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B.Two;

/**
 *
 * @author Pascal Felipe Sawaki
 */
// SmartLamp: implement Switchable + Connectable
public class SmartLamp implements Switchable, Connectable {

    private boolean isOn;         // status sakelar
    private int brightness;       // persentase kecerahan
    private String ssid;          // nama WiFi terhubung
    private String ipAddress;     // IP perangkat

    public SmartLamp() {
        this.isOn = false;
        this.brightness = 0;
    }

    @Override
    public void turnOn() {
        isOn = true;
        brightness = 100;         // default terang penuh
        System.out.println("[SmartLamp] Dinyalakan. Kecerahan: " + brightness + "%");
    }

    @Override
    public void turnOff() {
        isOn = false;
        brightness = 0;
        System.out.println("[SmartLamp] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // validasi state: tidak boleh connect kalau mati
        if (!isOn) {
            System.out.println("[SmartLamp] ERROR: Tidak bisa connect WiFi, perangkat masih mati.");
            return;
        }
        this.ssid = ssid;
        this.ipAddress = ipAddress;
        System.out.println("[SmartLamp] Terhubung ke WiFi '" + ssid + "' dengan IP " + ipAddress);
    }
}