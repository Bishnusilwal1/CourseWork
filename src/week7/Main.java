package week7;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Coordinates");
        int size = input.nextInt();
        input.close();

        Coordinate point[] = new Coordinate[size];
        for (int i = 0; i < size; i++) {
            point[i] = new Coordinate(randomNumber(), randomNumber());

        }

        int n = point.length;

        GiftWrapping gfw = new GiftWrapping();
        gfw.convexHall(point, n);

    }

    public static int randomNumber() {
        /* Providing the valid random number of the current dice */
        int number = (int) (Math.random() * 100) + 1;
        return number;
    }

}
