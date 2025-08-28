package Model;

import java.lang.Thread;

public class CountdownTimer extends Thread {

    private int timeRemaining;

    private double timeRemainingDouble;
    private int timeOfTick;
    private int timeDecrement;
    private double timeDecrementDouble;

    private TimerCallback timerCallback;

    public CountdownTimer(int timeRemaining, int timeOfTick, int timeDecrement, TimerCallback timerCallback) {
        this.timeRemaining = timeRemaining;
        this.timerCallback = timerCallback;
        this.timeOfTick = timeOfTick;
        this.timeDecrement = timeDecrement;

    }

    public CountdownTimer(double timeRemainingDouble, int timeOfTick, double timeDecrementDouble, TimerCallback timerCallback) {
        this.timeRemainingDouble = timeRemainingDouble;
        this.timerCallback = timerCallback;
        this.timeOfTick = timeOfTick;
        this.timeDecrementDouble = timeDecrementDouble;

    }

    @Override
    public void run() {
        if (timeRemaining != 0) {
            while (timeRemaining > 0) {
                timerCallback.onTick(timeRemaining);
                timeRemaining = timeRemaining - timeDecrement;
                try {
                    Thread.sleep(timeOfTick);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        if (timeRemainingDouble != 0.0) {
            while (timeRemainingDouble > 0.0) {
                timerCallback.onTick(timeRemainingDouble);
                timeRemainingDouble = timeRemainingDouble - timeDecrementDouble;
                try {
                    Thread.sleep(timeOfTick);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        timerCallback.onFinished();
    }

}



