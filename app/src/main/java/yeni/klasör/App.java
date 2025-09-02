package yeni.klasör;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    int matematik , fizik , kimya , turkce , tarih , muzik;
        Scanner ders_notu = new Scanner(System.in);

        System.out.println("Matematik notun:");
        matematik = ders_notu.nextInt();
        
        
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
        String durum = (ort > 60) ? "geçtiniz" : "kaldınız";
        System.out.println("ders ortalaman:" + ort);
        System.out.println(durum);
        ders_notu.close();
    }
}
