package Baitap.hoclaptrinh;

import java.util.Scanner;

public class giai_pt_bac_nhat {
    public static void main(String[] args){
        System.out.println("...");
        System.out.println("Giải pt bậc nhất 'a * x +b = c ' :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a : ");
        double a = sc.nextDouble();
        System.out.println("Nhập b : ");
        double b = sc.nextDouble();
        System.out.println("Nhập c : ");
        double c = sc.nextDouble();
        if (a != 0 ) {
            double answer = (c-b)/a;
            System.out.println( " x = " +  answer);
        } else {
            if (b==c) {
                System.out.println("Luôn đúng");
            } else {
                System.out.println("Vô lý !!");
            }
        }
    }

}
