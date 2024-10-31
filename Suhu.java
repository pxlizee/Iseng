import java.util.Scanner;

public class Suhu {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 9/5) + 32;

        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
    }
  }
}