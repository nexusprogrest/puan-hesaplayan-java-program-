package yeni.klasör;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    int matematik , fizik , kimya , turkce , tarih , muzik;
        System.out.println("Matematik notun:");
        Scanner ders_notu = new Scanner(System.in);
        int m_n = ders_notu.nextInt();

        System.out.println("fizik notun:");
        Scanner ders_notu2 = new Scanner(System.in);
        int f_n = ders_notu.nextInt();

        System.out.println("kimya notun:");
        Scanner ders_notu3 = new Scanner(System.in);
        int k_n = ders_notu.nextInt();

        System.out.println("türkçe notun:");
        Scanner ders_notu4 = new Scanner(System.in);
        int t_n = ders_notu.nextInt();
        
        System.out.println("tarih notun:");
        Scanner ders_notu5 = new Scanner(System.in);
        int tarih_n = ders_notu.nextInt();

        System.out.println("müzik notun:");
        Scanner ders_notu6 = new Scanner(System.in);
        int müzik_n = ders_notu.nextInt();
        
        int ort;
        ort = (m_n + f_n + k_n + t_n + tarih_n + müzik_n) / 6;
        System.out.println("ders ortalaman:" + ort);
    }
}
