public class Op {
    public static double operazione(char operator, double number1, double number2) {
        double result = 0;
        switch (operator){
            case '+':
                result = sumValues(number1,number2);
                break;
            case '-':
                result = subValues(number1,number2);
                break;
            case '*':
                result = moltValues(number1,number2);
                break;
            case '/':
                result = divValues(number1,number2);
                break;
            case '^':
                result = exponentialValues(number1,number2);
                break;

            default:
                System.out.println("operazione non valida.");
                break;

        }
        return  result;
    }
    public static double sumValues (double number1, double number2  ) {
        return number1 + number2;
    }
    // Method of subtraction
    public static double subValues (double number1, double number2) {
        return number1 - number2;
    }
    // Method of Multiplication
    public static double moltValues(double number1 , double number2) {
        return number1 * number2;
    }
    // Method of Division
    public static double divValues (double number1, double number2) {
        return number1 / number2;
    }

    //Method Even values
    public static String evenValues (double number1, double number2) {
        double sum = number1 + number2;
        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    //Method exponential values
    public static double exponentialValues (double number1, double numer2) {
        double result = 1.0;
        for (int i=0; i < numer2; i++) {
            result *= number1;
        }
        return result;
    }
}