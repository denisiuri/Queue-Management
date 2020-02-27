package PT2019.Tema2.Tema2Project;
import java.util.Timer;
import java.util.TimerTask;

public class TimerThread {
	private int seconds = 0;
	private int timeSimulate = 0;

	public void setTimeSimulate(int timeSimulate) {
		this.timeSimulate = timeSimulate;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	private Timer myTimer = new Timer();
	private TimerTask myTask = new TimerTask() {
		public void run() {
			seconds++;
			View.getTextArea().append("Seconds: " + seconds + "\n");
			System.out.println("Seconds: " + seconds);
			if(seconds == timeSimulate)
				myTimer.cancel();
		}
	};

	public void start() {
		myTimer.scheduleAtFixedRate(myTask, 1000, 1000);
	}

}
