package Service;

import Model.TimerCallback;

public class ShowResultDone extends Thread implements TimerCallback {

    @Override
    public void onTick(int timeRemaining) {
        System.out.println("Time: " + timeRemaining);
    }

    @Override
    public void onTick(double timeRemainingDouble) {
        System.out.println("Time: " + timeRemainingDouble);
    }

    @Override
    public void onFinished() {
        System.out.println("Done!");
    }

}
