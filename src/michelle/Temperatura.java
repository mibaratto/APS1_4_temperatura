package michelle;


public class Temperatura {

    private double celsius;
    private double farenheit;

    public void recebeTemperatura(String temperatura){
        if (temperatura.endsWith("F")) {
            String temp = temperatura.substring(0, temperatura.indexOf("F"));
            farenheit = Double.valueOf(temp);
            celsius = farenheitParaCelsius(farenheit);
        }
        else if (temperatura.endsWith("C")) {
            String temp = temperatura.substring(0, temperatura.indexOf("C"));
            celsius = Double.valueOf(temp);
            farenheit = celsiusParaFarenheit(celsius);
        }
        else {
            System.out.println("Formato incorreto");
        }
    }

    // °F = °C × 1, 8 + 32
    private double celsiusParaFarenheit(double temp){
        return temp * 1.8 + 32;
    }

    // °C = (°F − 32) ÷ 1, 8
    private double farenheitParaCelsius(double temp){
        return (temp - 32) / 1.8;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFarenheit() {
        return farenheit;
    }
}
