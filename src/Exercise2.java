
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Exercise2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n = scanner.nextInt();
        int[] x = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i<n;i++) { 
            x[i] = scanner.nextInt();
        }
        int max=x[0];
        int min=x[0];      
        for (int i=1;i< n;i++) { 
            if (x[i] > max){
                max = x[i];
            }
            if (x[i] < min){
                min = x[i];
            }
        }     
        System.out.println("Gia tri lon nhat trong mang la: " + max);
        System.out.println("Gia tri nho nhat trong mang la: " + min);       
    }
    
}

