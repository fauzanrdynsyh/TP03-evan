import java.util.Scanner;

public class TP2_2 {
    public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nama" );
        String nama = sc.nextLine();
        System.out.println("berapa usiamu");
        String usia = sc.nextLine();
    
        System.out.println("Haloo" + nama);
        System.out.println( " oke ternyata usiamu  " +  usia + " tahun ya");
    }
}