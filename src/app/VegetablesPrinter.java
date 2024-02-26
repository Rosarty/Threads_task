package app;

import static app.Main.fruitsThread;

public class VegetablesPrinter extends Thread {
    String[] namevegetables = new String[]{"Potato", "Tomato", "Onion"};

    public void run() {
        synchronized (fruitsThread) {
            for (String vegetable : namevegetables) {
                System.out.println("Vegetable: " + vegetable);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            fruitsThread.notify();
        }
    }
}
