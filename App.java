import java.util.Timer;
import java.util.TimerTask;
public class App {

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new MyTimeTask(),5*1000,5*1000);
    }
    static class MyTimeTask extends TimerTask{

        @Override
        public void run() {
            System.out.println("MyTimeTask is running");
        }
    }

}
