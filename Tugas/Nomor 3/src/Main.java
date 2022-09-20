// Rizqi Zamzami Jamil 20 2141762089
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 20;

        System.out.println("=-=-=-= MENGHITUNG LUAS & KELILING LINGKARAN =-=-=-=");
        System.out.print("Masukkan jari-jari : ");
        int jari = sc.nextInt();
        lingkaran.r = jari;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Luas     : " + lingkaran.hitungLuas());
        System.out.println("Keliling : " + lingkaran.hitungKeliling());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
