package PT2019.Tema2.Tema2Project;
import java.util.Random;

public class Client {
	private static int index = -1;
	private int arrTime = 0;
	private int arrivalTime = 0;
	private int serviceTime = 0;
	private int waitingTime = 0;
	private int finishTime = 0;
	private int id = 0;
	private TimerThread t;

	public Client() {
		this.id = ++this.index;
	}

	public Client(int f) {
		this.finishTime = f;

	}

	public Client(TimerThread t) {
		this.id = ++this.index;
		this.t = t;
	}

	public int getArrTime() {
		return arrTime;
	}

	public void setArrTime(int arrTime) {
		this.arrTime = arrTime;
	}

	public int getWaitingTime() {
		return waitingTime;
	}

	public void setWaitingTime() {
		this.waitingTime = this.finishTime - this.arrTime + this.serviceTime;
	}

	public int getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}

	public void randArrivalTime(int minArrivalTime, int maxArrivalTime) {
		Random rand = new Random();
		this.arrivalTime = rand.nextInt(maxArrivalTime - minArrivalTime) + minArrivalTime;
	}

	public void randServiceTime(int minServiceTime, int maxServiceTime) {
		Random rand = new Random();
		this.serviceTime = rand.nextInt(maxServiceTime - minServiceTime) + minServiceTime;
	}

	@Override
	public String toString() {
		return "Client [arrivalTime=" + arrivalTime + ", serviceTime=" + serviceTime + ",  id=" + id + "]";
	}

}
