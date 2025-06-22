package FinancialForecastApp;

public class FinancialForecast {

    
    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue; // base case
        }
        return calculateFutureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    
    public static double calculateFutureValueIterative(double presentValue, double rate, int years) {
        for (int i = 0; i < years; i++) {
            presentValue *= (1 + rate);
        }
        return presentValue;
    }

    public static void main(String[] args) {
        double presentValue = 10000.0; // ₹10,000
        double rate = 0.08; // 8% growth rate
        int years = 5;

        // Using recursive method
        double futureRecursive = calculateFutureValue(presentValue, rate, years);
        System.out.printf("Recursive: Value after %d years = Rs.%.2f%n", years, futureRecursive);

        // Using iterative method
        double futureIterative = calculateFutureValueIterative(presentValue, rate, years);
        System.out.printf("Iterative: Value after %d years = Rs.%.2f%n", years, futureIterative);
    }
}
