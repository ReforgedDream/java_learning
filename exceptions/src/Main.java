public class Main {

    public static void main(String[] args) {

        MathBox mb = new MathBox();

        System.out.println("MathBox.");
        System.out.println(mb.add(3, 4));
        System.out.println(mb.subtract(5, 2));
        System.out.println(mb.calculateFactorial(5));
        System.out.println(mb.divideExceptionInside(8, 0));
        try {
            System.out.println(mb.divide(6, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End of execution.");
    }
}
