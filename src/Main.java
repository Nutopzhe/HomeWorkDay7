import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String inputString;

        while (true) {
            System.out.println("Введите первую цифру, операцию, вторую цифру через пробел!");

            inputString = scanner.nextLine();
            String[] arrayInputString = inputString.split("\\s");

            if (arrayInputString.length != 3) {
                System.err.println("Неправильный формат ввода!");
                continue;
            }

            switch (arrayInputString[1]) {
                case "плюс":
                    try {
                        System.out.println(calculator.addition(arrayInputString[0],
                                arrayInputString[2]));
                    } catch (NumberFormatException e) {
                        System.err.println("Неверный формат цифр!");
                        e.printStackTrace();
                    }
                    break;
                case "минус":
                    try {
                        System.out.println(calculator.subtract(arrayInputString[0],
                                arrayInputString[2]));
                    } catch (NumberFormatException e) {
                        System.err.println("Неверный формат цифр!");
                        e.printStackTrace();
                    }
                    break;
                case "умножить":
                    try {
                        System.out.println(calculator.multiply(arrayInputString[0],
                                arrayInputString[2]));
                    } catch (NumberFormatException e) {
                        System.err.println("Неверный формат цифр!");
                        e.printStackTrace();
                    }
                    break;
                case "разделить":
                    try {
                        System.out.println(calculator.divide(arrayInputString[0],
                                arrayInputString[2]));
                    } catch (NumberFormatException e) {
                        System.err.println("Неверный формат цифр!");
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.err.println("Неправильная операция! Для подсказки введите: help");
            }
        }
    }
}
