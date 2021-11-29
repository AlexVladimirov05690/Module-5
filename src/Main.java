public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        double r = 5.0;
        System.out.println("The area of a circle with a radius of 5 mю. is " + Math.PI * r * r);
        System.out.println("Program execution time: " + (System.currentTimeMillis() - startTime) / 1000 + " seconds." );
    }
}
