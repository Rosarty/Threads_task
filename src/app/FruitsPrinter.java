package app;

public class FruitsPrinter extends Thread {
    String[] namefruits = new String[]{"Cherry", "Apple", "Orange"};

    public void run() {
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (String fruit : namefruits) {
            System.out.println("Fruit: " + fruit);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
