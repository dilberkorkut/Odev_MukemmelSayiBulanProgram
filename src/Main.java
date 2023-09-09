import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam =0;

        System.out.print("Bir sayi giriniz: ");
        int number = input.nextInt();

        for (int i =1; i<number; i++) {

            if(number%i == 0) {
                toplam += i;
            }
        }
        if(number == toplam) {
            System.out.println(number+ "Mukemmel bir sayidir.");
        } else {
            System.out.println(number+ "Mukemmel bir sayi degildir.");
        }
    }
}