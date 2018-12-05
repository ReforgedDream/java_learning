public class MathBox {

    public int add (Integer a, Integer b) {
        return a + b;
    }

    public int subtract (Integer a, Integer b) {
        return a - b;
    }

    public long calculateFactorial (Integer a) {
        long result = 1;
        for(int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public double divideExceptionInside(Integer a, Integer b) {
        double result = 0.0;
        try {
            result = ((double)a) / b;
        } catch(ArithmeticException e) {
            System.out.println("An exception has occured!");
            // Not sure if this string is really needed
            result = 0;
        }
        return result;
    }

    public double divide(Integer a, Integer b) throws CustomException {
        if(b == 0){
            throw new CustomException("Well... A text?");
        }
        double result = 0.0;
        result = ((double)a) / b;
        return result;
    }
}

class CustomException extends Exception{
    public CustomException() {}

    public CustomException(String message){
        super(message);
        System.out.println("A custom exception occured!");
    }
}
