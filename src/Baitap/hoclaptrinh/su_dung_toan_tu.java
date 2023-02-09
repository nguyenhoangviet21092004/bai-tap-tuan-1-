package Baitap.hoclaptrinh;

import java.util.Scanner;

public class su_dung_toan_tu {
    public static void main(String[] args) {
        System.out.println("Tính diện tích hình chữ nhật : ");

         Scanner sc = new Scanner(System.in);
         double area ;
        System.out.print("Nhập chiều rộng : ");
         double width = sc.nextDouble();
        System.out.println("Nhập chiều dài : ");
         double leght = sc.nextDouble(); ;


         area = width*leght;
         System.out.println("Diện tich hình chữ nhật là : " +  area);
    }
}
