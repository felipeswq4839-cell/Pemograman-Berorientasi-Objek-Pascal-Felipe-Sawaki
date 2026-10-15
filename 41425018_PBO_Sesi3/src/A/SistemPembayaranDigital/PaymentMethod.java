/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A.SistemPembayaranDigital;

/**
 *
 * @author Pascal Felipe Sawaki
 */
interface PaymentMethod {
    double TRANSACTION_FEE = 2500.0;
    
    void pay(double amount);
    String getPaymentDetails();
}