import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String inputString;

        while (true) {
            System.out.println("Введите первый аргумент, операцию, второй аргумент через пробел!");

            inputString = scanner.nextLine();
            String[] arrayInputString = inputString.split("\\s");

            if (arrayInputString.length != 3) {
                System.out.println("Неправильный формат ввода!");
                continue;
            }

            switch (arrayInputString[1]) {
                case "плюс":
                    System.out.println(calculator.addition(arrayInputString[0],
                            arrayInputString[2]));
                    break;
                case "минус":
                    System.out.println(calculator.subtract(arrayInputString[0],
                            arrayInputString[2]));
                    break;
                case "умножить":
                    System.out.println(calculator.multiply(arrayInputString[0],
                            arrayInputString[2]));
                    break;
                case "разделить":
                    System.out.println(calculator.divide(arrayInputString[0],
                            arrayInputString[2]));
                    break;
            }
        }
    }
}
