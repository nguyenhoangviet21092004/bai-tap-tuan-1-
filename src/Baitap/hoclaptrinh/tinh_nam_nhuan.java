package Baitap.hoclaptrinh;

import java.util.Scanner;

public class tinh_nam_nhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Nhập Năm : ");
        double year = sc.nextDouble();
        if (year % 4 == 0 ) {
            if (year % 100 == 0){
                if (year % 400 == 0 ){
                    System.out.println("Đây là năm nhuận .");
                } else {
                    System.out.println("Không phải năm nhuận . ");
                }
            } else {
                System.out.println("Đây là năm nhuận . ");
            }
        } else {
             System.out.println("Không phải năm nhuận . ");
        }

    }
}
