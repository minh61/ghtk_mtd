package Bai2;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Định dạng ngày: yyyy/MM/dd");
        System.out.print("Nhập ngày 1: ");
        String d1 = input.nextLine();
        System.out.print("Nhập ngày 2: ");
        String d2 = input.nextLine();

        Date date1 = new Date(d1);
        Date date2 = new Date(d2);

        long diff = date1.getTime() - date2.getTime();
        TimeUnit time = TimeUnit.DAYS;
        long diff_day = time.convert(diff, TimeUnit.MILLISECONDS);
        System.out.println(diff_day);
    }
}
