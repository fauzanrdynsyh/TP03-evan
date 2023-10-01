import java.util.Scanner;

public class TP3_3 {
    public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("permen yang ada");
        int n = sc.nextInt();
        System.out.println(" permen yang mau dibagi");
        int t = sc.nextInt();

        int permen1 =( n / t );
        System.out.println("hasil permen yang di dapat: " + permen1);
        if (t > n);
        System.out.println("permen tidak bisa dibagi");
        int permen2 =( n % t );
        System.out.println(" sisa permen yang ada: " + permen2);
	}
}