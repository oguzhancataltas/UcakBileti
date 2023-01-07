import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distance, age, travelType;
        double perKm = 0.10, total;
        boolean isError = false;

        System.out.print("Gideceğiniz Mesafeyi Giriniz : ");
        distance = input.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk Tipini Giriniz ( 1 --> Tek Yön , 2 --> Gidiş Dönüş ) : ");
        travelType = input.nextInt();

        total = distance * perKm;

        if (age >= 0 && distance >= 0){



            if ( age < 12){
                total *= 0.5;
            } else if (age < 25) {
                total *= 0.9;
            }else if (age >= 65) {
                total *= 0.7;
            }

            switch (travelType){
                case 1:
                    break;
                case 2:
                    total *= 1.6;
                    break;
                default:
                    isError = true;
                    break;
            }
        }else {
            isError = true;
        }

        if(isError) {
            System.out.println("Hatalı Veri Girdiniz!!!");
        }else {
            System.out.println("Toplam Tutar : " + total + " TL");
        }



    }
}
