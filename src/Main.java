public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        PaymentPi paymentPi = new PaymentPi();
        double r = 5.0;
        System.out.println("Еhe area of a circle with a radius of 5 mю. is " + paymentPi.payPi() * r * r);
        System.out.println("Program execution time: " + (System.currentTimeMillis() - startTime) / 1000 + " seconds." );
    }
}
