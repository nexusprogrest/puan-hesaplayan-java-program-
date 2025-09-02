package yeni.klasör;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    int matematik , fizik , kimya , turkce , tarih , muzik;
        Scanner ders_notu = new Scanner(System.in);

        matematik = ders_notu.nextInt();
        System.out.println("Matematik notun:");
        System.out.println("fizik notun:");
        fizik = ders_notu.nextInt();

        System.out.println("kimya notun:");
        kimya = ders_notu.nextInt();

        System.out.println("türkçe notun:");
        turkce = ders_notu.nextInt();
        
        System.out.println("tarih notun:");
        tarih = ders_notu.nextInt();

        System.out.println("müzik notun:");
        muzik = ders_notu.nextInt();
        
        double ort;
        ort = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("ders ortalaman:" + ort);
    }
}
