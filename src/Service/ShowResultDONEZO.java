package Service;

import Model.TimerCallback;

public class ShowResultDONEZO implements TimerCallback {

    @Override
    public void onTick(int timeRemaining) {
        System.out.println(timeRemaining);
    }

    @Override
    public void onTick(double timeRemainingDouble) {
        System.out.println(timeRemainingDouble);
    }

    @Override
    public void onFinished() {
        System.out.println("DONEZO");
    }

}
