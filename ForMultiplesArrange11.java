import java.util.Scanner;

public class ForMultiplesArrange11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiple, sum = 0, counter = 0, average = 0;

        System.out.print("input the multiple = ");
        multiple = input.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum = + i;
                counter++;
                average = + i;
            if (counter != 0) {
                average = average / counter;
                System.out.println("average of multiples: " + average);
            } else {
                System.out.println("No multiples found. ");
            }
            }
        }

        System.out.printf("There are %d numbers that are multiples of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d. \n", multiple, sum);

        input.close();
    }

}