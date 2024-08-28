
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap so phan tu mang ");
        int n = scanner.nextInt();
        int[] x = new int[n];     
        System.out.println("Nhap cac phan tu cua mang : ");
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        Arrays.sort(x);       
        System.out.println("Mang sau khi sap xep tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
    

