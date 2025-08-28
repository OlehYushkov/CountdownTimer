import Model.CountdownTimer;
import Service.ShowResultDONEZO;
import Service.ShowResultDone;

public class Main {

    public static void main(String[] args) {
        CountdownTimer countdownTimer = new CountdownTimer(6, 1000, 1, new ShowResultDONEZO());
        CountdownTimer countdownTimer2 = new CountdownTimer(8, 500, 1, new ShowResultDone());
        CountdownTimer countdownTimer3 = new CountdownTimer(10.0, 1000, 1.25, new ShowResultDONEZO());

        countdownTimer.start();
        countdownTimer2.start();
        countdownTimer3.start();
    }

}
