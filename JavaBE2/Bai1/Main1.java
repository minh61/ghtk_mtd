package Bai1;

import java.util.Scanner;

public class Main1 {
    static Scanner input = new Scanner(System.in);
    public enum Month{
        JANUARY(31),
        FEBRUARY(28),
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);
        private int value;

        private Month(int value) {
            this.value = value;
        }


    }
    public static void main(String[] args) {
        System.out.println("Nhập tháng (1,2,3,...): ");
        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("Tháng 1 có " + Month.JANUARY.value + " ngày");
                break;
            case 2:
                System.out.println("Tháng 2 có " + Month.FEBRUARY.value + " ngày");
                break;
            case 3:
                System.out.println("Tháng 3 có " +  Month.MARCH.value + " ngày");
                break;
            case 4:
                System.out.println("Tháng 4 có " + Month.APRIL.value + " ngày");
                break;
            case 5:
                System.out.println("Tháng 5 có " + Month.MAY.value + " ngày");
                break;
            case 6:
                System.out.println("Tháng 6 có " + Month.JUNE.value + " ngày");
                break;
            case 7:
                System.out.println("Tháng 7 có " + Month.JULY.value + " ngày");
                break;
            case 8:
                System.out.println("Tháng 8 có " + Month.AUGUST.value + " ngày");
                break;
            case 9:
                System.out.println("Tháng 9 có " + Month.SEPTEMBER.value + " ngày");
                break;
            case 10:
                System.out.println("Tháng 10 có " + Month.OCTOBER.value + " ngày");
                break;
            case 11:
                System.out.println("Tháng 11 có " + Month.NOVEMBER.value + " ngày");
                break;
            case 12:
                System.out.println("Tháng 12 có " + Month.DECEMBER.value + " ngày");
                break;
            default:
                System.out.println("Nhập sai tháng");
                break;
        }


    }
}
