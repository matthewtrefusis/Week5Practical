
import java.util.Scanner;
public class W05P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 1;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if ( num == count ) {
                count++;
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
