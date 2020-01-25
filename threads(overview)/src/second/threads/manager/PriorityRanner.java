package second.threads.manager;

import second.threads.logic.PriorThread;

public class PriorityRanner {

    private static final String MIN = "Min";
    private static final String MAX = "Max";
    private static final String NORM =  "Norm";

    public static void main(String[] args) {
        PriorThread min = new PriorThread(MIN);
        PriorThread norm = new PriorThread(NORM);
        PriorThread max = new PriorThread(MAX);

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);

        min.start();
        max.start();
        norm.start();
    }
}
