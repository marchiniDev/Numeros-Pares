import java.io.IOException;
import java.util.Scanner;

public class ShowEvenNumbers {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int numb;

        numb = scan.nextInt();
        scan.close();


        for (int i = 1; i <= numb; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}