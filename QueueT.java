package PT2019.Tema2.Tema2Project;
import java.util.Queue;
import java.util.LinkedList;

public class QueueT extends Thread {
	private Queue<Client> queue = new LinkedList<Client>();
	private static int index = 0;
	private float avgWaitingTime = 0;
	private float avgServiceTime = 0;
	private int emptyQueueTime = 0;
	private int totalNoOfClients = 0;
	private int noOfClients = 0;
	private int totalWaitingTime = 0;
	private int totalServiceTime = 0;
	private int time = 0;
	private int timeSimulate = 0;
	private TimerThread t;

	public QueueT(TimerThread t, int timer) {
		this.index = this.index + 1;
		this.t = t;
		this.timeSimulate = timer;
	}

	public int getTimeSimulate() {
		return timeSimulate;
	}

	public void setTimeSimulate(int timeSimulate) {
		this.timeSimulate = timeSimulate;
	}

	public Queue<Client> getQueue() {
		return queue;
	}

	public void setQueue(Queue<Client> queue) {
		this.queue = queue;
	}

	public static int getIndex() {
		return index;
	}

	public static void setIndex(int index) {
		QueueT.index = index;
	}

	public int getTotalNoOfClients() {
		return totalNoOfClients;
	}

	public void setTotalNoOfClients(int totalNoOfClients) {
		this.totalNoOfClients = totalNoOfClients;
	}

	public float getAvgWaitingTime() {
		return avgWaitingTime;
	}

	public void setAvgWaitingTime(Client c) {
		this.totalWaitingTime = this.totalWaitingTime + c.getWaitingTime();
		this.avgWaitingTime = (float) this.totalWaitingTime / this.totalNoOfClients;
	}

	public float getAvgServiceTime() {
		return avgServiceTime;
	}

	public void setAvgServiceTime(int avgServiceTime) {
		this.avgServiceTime = avgServiceTime;
	}

	public int getEmptyQueueTime() {
		return emptyQueueTime;
	}

	public void setEmptyQueueTime(int emptyQueueTime) {
		this.emptyQueueTime = emptyQueueTime;
	}

	public int getNoOfClients() {
		return noOfClients;
	}

	public void setNoOfClients(int noOfClients) {
		this.noOfClients = noOfClients;
	}

	public void addClient(Client c) {
		queue.add(c);
		this.noOfClients = this.noOfClients + 1;
		this.totalNoOfClients = this.totalNoOfClients + 1;

		this.totalServiceTime = this.totalServiceTime + c.getServiceTime();
		this.avgServiceTime = (float) this.totalServiceTime / (float) this.totalNoOfClients;

	}

	@Override
	public String toString() {
		return " [queue=" + queue + ", noOfClients=" + noOfClients + "]";
	}

	public void run() {

		Client c;
		{
			while (t.getSeconds() < timeSimulate) {

				if (queue.isEmpty() != true) {
					try {

						time = queue.peek().getServiceTime();
						Thread.sleep(time * 1000);
						if (queue.isEmpty() != true) {
							c = new Client(t.getSeconds());
							c = queue.remove();
							
							View.getTextArea().append("Client removed successfully: " + c + "\n");
	
							c.setFinishTime(t.getSeconds());

							c.setWaitingTime();

							this.setAvgWaitingTime(c);
							this.noOfClients--;
						}

					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					try {

						this.emptyQueueTime++;
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		}
	}
}
