public class Calculator {
    public double addition(String d1, String d2) throws NumberFormatException {
        Double firstDigit = Double.parseDouble(d1);
        Double secondDigit = Double.parseDouble(d2);

        return firstDigit + secondDigit;
    }

    public double subtract(String d1, String d2) throws NumberFormatException {
        Double firstDigit = Double.parseDouble(d1);
        Double secondDigit = Double.parseDouble(d2);

        return firstDigit - secondDigit;
    }

    public double multiply(String d1, String d2) throws NumberFormatException {
        Double firstDigit = Double.parseDouble(d1);
        Double secondDigit = Double.parseDouble(d2);

        return firstDigit * secondDigit;
    }

    public double divide(String d1, String d2) throws NumberFormatException {
        Double firstDigit = Double.parseDouble(d1);
        Double secondDigit = Double.parseDouble(d2);

        return firstDigit / secondDigit;
    }
}
