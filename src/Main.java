import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, sum=0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            k = input.nextInt();
            if (k % 4 == 0){
                sum += k;
            }
        }while (k % 2 == 0);

        System.out.println(sum);
    }
}