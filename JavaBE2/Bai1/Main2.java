package Bai1;

import java.util.Scanner;

public class Main2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập tháng (1,2,3,...): ");
        int month = input.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng" + month + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng " + month + " có 28 ngày");
                break;
            default:
                System.out.println("Nhập sai tháng");
                break;
        }

    }
}
