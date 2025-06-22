package Financial_Forecast;

public class financial_forecast {

    public static double forecastValue(double currentValue, double growthRate, int years) {
        if (years == 0) return currentValue;  // base case
        return forecastValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double startValue = 1000.0;   
        double growthRate = 0.10;       
        int years = 5;

        double result = forecastValue(startValue, growthRate, years);
        System.out.printf("Future Value after %d years = %.2f\n", years, result);
    }
}
