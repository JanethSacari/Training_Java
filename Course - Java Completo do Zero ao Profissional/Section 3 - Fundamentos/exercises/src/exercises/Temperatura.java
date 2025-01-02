package exercises;

public class Temperatura {
    public static void main (String ... args) {
        int tempFarenheit = 50;
        double multiplicador = 5;
        double divisor = 9;

        double tempCelsius = (tempFarenheit - 32) * multiplicador / divisor;
        System.out.println("Temperatura em celsius: " + tempCelsius);
    }
}
