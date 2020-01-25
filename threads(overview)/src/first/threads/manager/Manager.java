package first.threads.manager;

import first.threads.logic.*;

public class Manager {

    public static void main(String[] args) {

        TalkThread talk = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());

        walk.start();
        talk.start();

    }

}
