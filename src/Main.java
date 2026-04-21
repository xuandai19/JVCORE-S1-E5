import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cân nặng = ");
        float cn = sc.nextInt();
        System.out.print("Chiều cao = ");
        float ch = sc.nextFloat();

        System.out.printf("Chỉ số BMI = %.2f", cn / (ch * ch));
    }
}
