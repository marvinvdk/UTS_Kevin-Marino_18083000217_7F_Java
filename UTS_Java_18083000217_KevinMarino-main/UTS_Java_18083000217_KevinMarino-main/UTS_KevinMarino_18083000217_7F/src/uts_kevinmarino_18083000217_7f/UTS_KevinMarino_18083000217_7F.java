/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_kevinmarino_18083000217_7f;
import java.util.Scanner;
/**
 *
 * @author V
 */
public class UTS_KevinMarino_18083000217_7F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
      System.out.print("Masukkan Berat Badan pada Kilogram: ");
      double weight = sc.nextDouble();
      System.out.print("Masukkan Tinggi Badan pada Meter: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.print("The Body Mass Index (BMI) adalah " + BMI + " kg/m2");
   }
}
