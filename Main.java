import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* Soru-2 matematik, fizik, kimya, turkce, tarih, muzik derslerinin sinav puanlarini kullanicdan alan ve
        ortalamalarini hesaplayip ekrana bastirilan program

        ayni program icerisinde kosullu ifadeler kullanilarak eger kullanicinin ortalamasi 60'dan buyuk ise
        ekrana gecti kucuk ise kaldi yazsin if kullanilmadan cozunuz .
         */

        //degiskenleri tanimlayalim
        int mat,fizik,kimya,turkce,tarih,muzik;
        float toplam,sonuc;

        //kullanicidan deger alabilmek icin scanner sinifimizdan nesne turetelim.
        Scanner input = new Scanner(System.in);

        //kullanicidan degerleri alalim
        System.out.print("Matematik Notunuz :");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz :");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz :");
        kimya = input.nextInt();
        System.out.print("Turkce Notunuz :");
        turkce = input.nextInt();
        System.out.print("Tarih Notunuz :");
        tarih = input.nextInt();
        System.out.print("Muzik Notunuz :");
        muzik = input.nextInt();

        //toplam sayiyi hesaplayalim
        toplam = mat+fizik+kimya+turkce+tarih+muzik;
        //sonuc yani ortalamayi hesaplayalim
        sonuc = toplam / 6 ;

        //sonucu ekrana yazdiralim
        //System.out.println("Ortalama : " + sonuc );

        //boolean turunde gecti olarak bir degisken tanimlayacaz
        boolean gecti = sonuc > 60 ;

        String gec = gecti ? "Gecti" : "Kaldi";
        System.out.print("Ortalamaniz : "+ sonuc + gec);
    }
}