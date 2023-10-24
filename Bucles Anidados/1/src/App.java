import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int asteriscos_nece = 1;
        int i = 1;
        int j = 1;


        System.out.print("Numero: ");
        int num = sc.nextInt();


        sc.close();

        for (; i <= num; i++) {
            for (; j <= asteriscos_nece ;){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            asteriscos_nece++;
            j = 1;
            
            
            
        }
    }
}
