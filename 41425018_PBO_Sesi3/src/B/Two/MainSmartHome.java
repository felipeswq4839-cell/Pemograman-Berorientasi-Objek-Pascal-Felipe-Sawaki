/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B.Two;

/**
 *
 * @author Pascal Felipe Sawaki
 */
public class MainSmartHome {
    public static void main(String[] args) {

        System.out.println("=-=-=-= SKENARIO 1: SmartLamp =-=-=-=");
        SmartLamp lamp = new SmartLamp();

        // coba connect WiFi saat mati -> harus error
        lamp.connectToWifi("HomeWiFi", "192.168.1.10");

        // nyalakan lalu connect
        lamp.turnOn();
        lamp.connectToWifi("HomeWiFi", "192.168.1.10");

        // matikan
        lamp.turnOff();

        System.out.println("");
        System.out.println("=-=-=-= SKENARIO 2: SmartAC =-=-=-=");
        SmartAC ac = new SmartAC();

        // connect saat mati -> error
        ac.connectToWifi("HomeWiFi", "192.168.1.11");

        // nyalakan lalu connect
        ac.turnOn();
        ac.connectToWifi("HomeWiFi", "192.168.1.11");

        // matikan
        ac.turnOff();
    }
}