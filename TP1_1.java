import java.util.Scanner;

public class TP1_1 {
    public static void main(final String[] args) {
		 Scanner sc = new Scanner(System.in);
            System.out.println("masukkan suhu  pertama:");
            Float x = sc.nextFloat();
            System.out.println("masukkan suhu ke dua:");
            Float y = sc.nextFloat();

            Float farenheit1  = (x * 9 / 5) + 32;
            Float farenheit2  = (y * 9 / 5) + 32;

            Float kelvin1 = (x + 273);
            Float kelvin2 = (y + 273);

            System.out.println("nilai farenheit 1" + farenheit1);
            System.out.println("nilai farenheit 2" + farenheit2);
            System.out.println("nilai kelvin1" + kelvin1);
            System.out.println("nilai kelvin2 " + kelvin2);
    }
}
