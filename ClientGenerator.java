package PT2019.Tema2.Tema2Project;
public class ClientGenerator extends Thread {
	private Client c;
	private TimerThread t;
	private int minArrivalTime = 0;
	private int maxArrivalTime = 0;
	private int minServiceTime = 0;
	private int maxServiceTime = 0;
	private int timeSimulate = 0;
	private QueuesManager queueList;

	public ClientGenerator(TimerThread t, QueuesManager q) {
		this.t = t;
		this.queueList = q;
	}

	public ClientGenerator(QueuesManager q, Client c, TimerThread t, int minArr, int maxArr, int minSer, int maxSer) {
		this.queueList = q;
		this.c = c;
		this.t = t;
		this.minArrivalTime = minArr;
		this.maxArrivalTime = maxArr;
		this.minServiceTime = minSer;
		this.maxServiceTime = maxSer;
	}

	public int getTimeSimulate() {
		return timeSimulate;
	}

	public void setTimeSimulate(int timeSimulate) {
		this.timeSimulate = timeSimulate;
	}

	public int getMinArrivalTime() {
		return minArrivalTime;
	}

	public void setMinArrivalTime(int minArrivalTime) {
		this.minArrivalTime = minArrivalTime;
	}

	public int getMaxArrivalTime() {
		return maxArrivalTime;
	}

	public void setMaxArrivalTime(int maxArrivalTime) {
		this.maxArrivalTime = maxArrivalTime;
	}

	public int getMinServiceTime() {
		return minServiceTime;
	}

	public void setMinServiceTime(int minServiceTime) {
		this.minServiceTime = minServiceTime;
	}

	public int getMaxServiceTime() {
		return maxServiceTime;
	}

	public void setMaxServiceTime(int maxServiceTime) {
		this.maxServiceTime = maxServiceTime;
	}

	public void run() {
		int index = 0;
		try {
			while (t.getSeconds() < timeSimulate) {
				
				if (Thread.interrupted() != true)
					c = new Client();
				c.setArrivalTime(t.getSeconds());
				c.randArrivalTime(minArrivalTime, maxArrivalTime);
				c.randServiceTime(minServiceTime, maxServiceTime);
				index = queueList.getTheShortestQueue();
				c.setArrTime(t.getSeconds());
				queueList.getQueue(index).addClient(c);
				System.out.println(queueList.getQueue(index).toString() + "Index: " + index);	
				View.getTextArea().append("Client successfully added : " + c.toString() + "\n");
				View.getTextArea().append("Queue: " + index + queueList.getQueue(index).toString() + "\n");
				Thread.sleep(c.getArrivalTime() * 1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
