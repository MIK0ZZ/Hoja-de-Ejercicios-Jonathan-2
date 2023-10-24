import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime 3 números y te digo el mayor: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();

        //No tengo muy claro cual es el menor número de comprobaciones posibles

        if ((n1 > n2) && (n1 > n3)) {
            System.out.println(n1 + " es el mayor");
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.println(n2 + " es el mayor");
        } else if ((n3 > n1) && (n3 > n2)) {
            System.out.println(n3 + " es el mayor");
        } else if ((n1 == n2) && (n1 == n3) && (n2 ==n3)) {
            System.out.println("Son todos iguales");
        }

    }
}
