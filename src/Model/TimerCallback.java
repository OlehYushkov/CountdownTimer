package Model;

public interface TimerCallback {

    void onTick(int timeRemaining);

    void onTick(double timeRemaining);

    void onFinished();

}
