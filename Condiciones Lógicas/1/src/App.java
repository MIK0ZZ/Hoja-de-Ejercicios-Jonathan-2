import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("A continuación dime la medida de 3 lados de un triángulo y te digo de que tipo es: ");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();
        sc.close();


        if ((l1 == l2) && (l1 == l3)) {
            System.out.println("Es equilátero");
        } else if (((l1 == l2) && (l1 != l3)) || ((l1 != l2) && (l1 == l3)) || ((l2 == l3) && (l2 != l1))) {
            System.out.println("Es isósceles");
        } else if ((l1 != l2) && (l1 != l3)) {
            System.out.println("Es escaleno");
        }


    }
}
