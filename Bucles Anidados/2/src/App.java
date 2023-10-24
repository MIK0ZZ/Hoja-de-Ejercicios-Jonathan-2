import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num_nece = 1;
        int i = 1;
        int j = 1;
        int nume = 1;

        System.out.print("Numero: ");
        int num = sc.nextInt();


        sc.close();

        for (; i <= num; i++) {
            for (; j <= num_nece ;){
                System.out.print(nume);
                nume = nume +1;
                j++;
            }
            System.out.print("\n");
            num_nece++;
            nume = 1;
            j = 1;
            
            
            
        }
    }
}
