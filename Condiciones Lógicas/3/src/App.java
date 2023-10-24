import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime 3 números y te digo en que orden están: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();

        if (n1 > n2) {
            if (n2 > n3) {
                System.out.println("Están en orden decreciente.");
            } else {System.out.println("No hay orden.");}
        } else if (n2 > n1) {
            if (n3 > n2) {
                System.out.println("Están en orden creciente.");
            } else {System.out.println("No hay orden.");}
        }

    }
}
