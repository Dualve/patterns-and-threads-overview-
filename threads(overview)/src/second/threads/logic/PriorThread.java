package second.threads.logic;

public class PriorThread extends Thread{

    private static final int BOARDER = 71;
    private static final int TIME_SLEEP = 2;
    private static final String EXCEPTION = "Exception";

    public PriorThread(String name){
        super(name);
    }

    public void run(){
        for(int i = 0; i < BOARDER; i++){
            System.out.println(getName() + " " + i);

            try {
                Thread.sleep(TIME_SLEEP);
            }
            catch (InterruptedException e) {
                System.err.println(EXCEPTION + e);
            }
        }
    }
}
