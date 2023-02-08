package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius) {
        int fahrenheitConverter = (temperatureCelsius * 9 / 5) + 32;
        System.out.println(fahrenheitConverter);
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.toFahrenheit(24);
    }
}
