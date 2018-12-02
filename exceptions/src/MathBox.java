public class MathBox {

    public int add (Integer a, Integer b) {
        return a.intValue() + b.intValue();
    }

    public int subtract (Integer a, Integer b) {
        return a.intValue() - b.intValue();
    }

    public long calculateFactorial (Integer a) {
        long result = 1L;
        for(int i = 1; i <= i; i++) {
            result *= i;
        }
        return result;
    }

    public double divideExceptionInside(Integer a, Integer b) {
        double result = 0.0;
        try {
            result = a.intValue() / b.intValue();
        } catch(ArithmeticException e) {
            System.out.println("An exception has occured!");
            // Not sure if this string is really needed
            result = 0;
        }
        return result;
    }

    public double divide(Integer a, Integer b) throws Exception {
        double result = 0.0;
        result = a.intValue() / b.intValue();
        return result;
    }


}
