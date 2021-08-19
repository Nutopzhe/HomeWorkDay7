public class Calculator {
    public double addition(String d1, String d2) throws NumberFormatException {
        double firstDigit = Double.parseDouble(d1);
        double secondDigit = Double.parseDouble(d2);

        return firstDigit + secondDigit;
    }

    public double subtract(String d1, String d2) throws NumberFormatException{
        double firstDigit = Double.parseDouble(d1);
        double secondDigit = Double.parseDouble(d2);

        return firstDigit - secondDigit;
    }

    public double multiply(String d1, String d2) throws NumberFormatException {
        double firstDigit = Double.parseDouble(d1);
        double secondDigit = Double.parseDouble(d2);

        return firstDigit * secondDigit;
    }

    public double divide(String d1, String d2) throws NumberFormatException, ArithmeticException {
        double firstDigit = Double.parseDouble(d1);
        double secondDigit = Double.parseDouble(d2);
        if (secondDigit == 0) {
            throw new ArithmeticException();
        }
        return firstDigit / secondDigit;
    }
}
