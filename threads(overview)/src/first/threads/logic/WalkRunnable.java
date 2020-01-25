package first.threads.logic;

public class WalkRunnable implements Runnable {

    private static final int BORDER = 10;
    private static final int TIME_SLEEP = 7;
    private static final String OUT = "Walk";
    private static final String EXCEPTION = "Exception";

    @Override
    public void run() {

        for (int i = 0; i < BORDER; i++) {
            System.out.println(OUT);

            try {
                Thread.sleep(TIME_SLEEP);
            } catch (InterruptedException e) {
                System.err.println(EXCEPTION + e);
            }
        }
    }
}
