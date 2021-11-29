public class PaymentPi {
    long number = 1000000000L; //количество элементов ряда Лейбница

    private static boolean chet(long i) { //метод определения четного/нечетного числа
        double n = i / 2;
        long x = (long) n;
        x = x * 2;
        if (x == i) return true;
        else return false;
    }

    public double payPi(){ //вычисление ряда Лейбница
        double n = 1;
        double pi = 1;
        for (long i = 0; i < number; i++) {
            n += 2;
            if(chet(i)) {
                pi = pi - (1 / n);
            } else {
                pi = pi + (1 / n);
            }
        }
        return pi * 4;
    }
}
