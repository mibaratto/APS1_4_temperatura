package michelle;

public class Main {

    public static void main(String[] args) {

        Temperatura temperatura = new Temperatura();

        temperatura.recebeTemperatura("40C");
        System.out.println(temperatura.getCelsius() + "C");
        System.out.println(temperatura.getFarenheit() + "F");

        temperatura.recebeTemperatura("50F");
        System.out.println(temperatura.getFarenheit() + "F");
        System.out.println(temperatura.getCelsius() + "C");

    }
}
