/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B.Two;

/**
 *
 * @author Pascal Felipe Sawaki
 */
// interface untuk perangkat yang bisa konek WiFi
public interface Connectable {
    void connectToWifi(String ssid, String ipAddress);  // hubungkan ke jaringan
}