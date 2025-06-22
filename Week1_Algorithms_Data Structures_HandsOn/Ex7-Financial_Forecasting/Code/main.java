package Financial_Forecast;

public class main{
    public static void main(String[] args) {
        double startValue = 1000.0;      // initial investment
        double growthRate = 0.10;        // 10% growth per year
        int years = 5;

        double result = financial_forecast.forecastValue(startValue, growthRate, years);
        System.out.printf("Future Value after %d years = %.2f\n", years, result);
    }
}
