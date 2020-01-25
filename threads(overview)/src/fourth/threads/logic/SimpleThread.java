package fourth.threads.logic;

public class SimpleThread extends Thread {

    public void run() {

        try {
            if (isDaemon()) {
                System.out.println("Cтарт потока демона");
                Thread.sleep(10_000); //поток main может завершить программу, даже если поток-демон не закончил работу
            } else {
                System.out.println("Старт обычного потока");
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            if (!isDaemon()){
                System.out.println("Завершение обычного потока");
            }else{
                System.out.println("Заверешние потока демона");
            }
        }
    }
}
