package Baitap.hoclaptrinh;

import java.util.Scanner;

public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng");
        int month = sc.nextInt();

        switch (month) {
            case 2:
                System.out.println("Có 28 hoặc 29 ngày . ");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày");
                break;
            default:
                System.out.println("Không có tháng này");
        }



        }
    }

