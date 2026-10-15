/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pascal Felipe Sawaki
 */
public class Circle {
// Variable (Atribut/Field)
double radius;
private String color;
// Constructor 1 (Default)
public Circle() {
this.radius = 1.0;
this.color = "red";
}
// Constructor 2 (Overloading dengan parameter radius)
public Circle(double r) {
this.radius = r;
this.color = "red";
}
// Constructor 3 (Overloading dengan parameter radius & color)
public Circle(double r, String c) {
this.radius = r;
this.color = c;
}
// Method untuk mengambil nilai radius
public double getRadius() {
return this.radius;
}
// Method untuk mengambil nilai color
public String getColor() {
return this.color;
}
// Method untuk menghitung luas lingkaran (Area)
public double getArea() {
return this.radius * this.radius * Math.PI;
}
}