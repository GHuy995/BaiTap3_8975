/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



import java.util.Random;
import java.util.Scanner;


public class Exercise1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
        String check;
        do {
            int n = random.nextInt(100) + 1; 
            System.out.println("Nhap vao check (Yes de tiep tuc): ");
            check = scanner.nextLine();
            if (n % 2 == 0){
                System.out.println(n+" la so chan");
            }else{
                System.out.println(n+" la so le");
            }
        }while(check.equalsIgnoreCase("Yes"));
        System.out.println("Ket thuc chuong trinh");
    }
}

            


