import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String inputString;

        while (true) {
            System.out.println("Введите первую цифру, операцию, вторую цифру через пробел!");

            inputString = scanner.nextLine();

            if (inputString.equalsIgnoreCase("help")) {
                System.out.println("Возможные операции:\n\tплюс\n\tминус\n\tумножить\n\tразделить\n" +
                        "Для выхода из программы введите:\n\texit");
            }

            if (inputString.equalsIgnoreCase("exit")) {
                break;
            }

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
                    } catch (ArithmeticException e) {
                        System.err.println("Деление на 0 запрещено!");
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.err.println("Неправильная операция! Для подсказки введите: help");
            }
        }
    }
}
