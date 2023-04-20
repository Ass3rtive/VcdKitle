import java.util.Scanner;
public class VcdKitle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double kilo, boy;

        System.out.print("Kilonuzu Giriniz : ");
        kilo = input.nextDouble();

        System.out.print("Boyunuzu Giriniz : ");
        boy = input.nextDouble();

        double vcd = kilo/(boy * boy);
        System.out.println("Vücud Kitle Endeksiniz :  " + vcd);

        /**
         * @author Erdem AYDEMİR
         */

    }
}
