package Baitap.hoclaptrinh;

import java.util.Scanner;

public class Tinh_so_can_nang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập chiều cao : ");
        double height = sc.nextDouble();
        System.out.println("Nhập cân nặng");
        double weight = sc.nextDouble();
        double BMI = weight/ Math.pow(height,2);

        if(BMI <18 ){
            System.out.println("Gầy");

        } else if (BMI<25) {
            System.out.println("Bình thường");

        } else if (BMI <35) {
            System.out.println("Béo ");
        }
    }
}
