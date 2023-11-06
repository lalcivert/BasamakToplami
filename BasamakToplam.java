package day01;

import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        int sayi,toplam=0;

        System.out.println("sayıyı giriniz: ");
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();

        while(sayi != 0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println("girilen sayının basamakları toplamı: "+toplam);

    }
}
