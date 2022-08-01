import java.util.Scanner;
public class hesapmakinesi {
    public static void main (String [] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("1.Sayiyi Giriniz : ");
        int sayi1 = inp.nextInt();
        System.out.print("2.Sayiyi Giriniz: ");
        int sayi2 = inp.nextInt();

        System.out.println("LUTFEN ISLEM NUMARAINIZI SEÇINIZ : ");
        System.out.println("1.TOPLAMA ");
        System.out.println("2.CIKARMA");
        System.out.println("3.CARPMA");
        System.out.println("4.BOLME");

        System.out.print("SECIMINIZI GIRINIZ : ");
        int secim = inp.nextInt();

        switch (secim) {
            case 1:
                System.out.println("TOPLAMA ISLEMININ SONUCU : " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("CIKARMA ISLEMININ SONUCU: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("CARPMA ISLEMININ SONUCU : " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("BOLME ISLEMININ SONUCU :  " + (float) sayi1 / sayi2);


        }
    }
}
