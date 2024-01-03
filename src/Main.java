public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(4.15,2.123,'+');
        Calculator c2= new Calculator(5.123123,9.99,'-');
        Calculator c3 = new Calculator(0.01,521.734,'*');
        Calculator c4 = new Calculator(4123,22,'/');
        Calculator c5 = new Calculator(4123,22,'W');
        System.out.println(
                "Addition: " + c1.calculation() + "\n" +
                "Subtraction: " + c2.calculation() + "\n" +
                "Multiplication: " + c3.calculation() + "\n" +
                "Division: " + c4.calculation() + "\n" +
                c5.calculation()
        );
    }
}