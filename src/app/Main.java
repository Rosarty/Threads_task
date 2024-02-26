package app;

public class Main {
    static FruitsPrinter fruitsThread = new FruitsPrinter();
    static VegetablesPrinter vegetablesThread = new VegetablesPrinter();

    public static void main(String[] args) {

        fruitsThread.start();
        vegetablesThread.start();
    }
}
