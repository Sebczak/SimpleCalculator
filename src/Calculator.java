public class Calculator {
    private double firstValue, secondValue;
    private char sign;

    public Calculator(double firstValue, double secondValue, char sign) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.sign = sign;
    }

    public double Calculation() {
        double result = 0d;

        switch (sign) {
            case '+': result = firstValue + secondValue;
            case '-': result = firstValue - secondValue;
            case '*': result = firstValue * secondValue;
            case '/':
                if(firstValue == 0 || secondValue == 0) {
                    return 0;
                }
                result = firstValue / secondValue;
            default:
                System.out.println("Invalid sign: " + sign);
        }
        return result;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }
}
