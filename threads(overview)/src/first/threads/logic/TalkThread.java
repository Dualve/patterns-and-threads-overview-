package first.threads.logic;

public class TalkThread extends Thread {

    private static final int BORDER = 10;
    private static final int SLEEP_TIME = 7;
    private static final String OUT = "Talk";
    private static final String EXCEPTION = "Exception";

    @Override
    public void run() {

        for (int i = 0; i < BORDER; i++) {
            System.out.println(OUT);

            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                System.err.println(EXCEPTION + e);
            }
        }
    }
}
