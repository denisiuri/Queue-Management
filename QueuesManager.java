package PT2019.Tema2.Tema2Project;
public class QueuesManager {
	private QueueT [] qArray;
	private TimerThread t;
	private int timeSimulate;
	
	public QueuesManager(TimerThread t) {
		this.t = t;
	}
	
	public QueuesManager(QueueT[] q) {
		this.qArray = q;
	}
	
	public QueueT[] getqArray() {
		return qArray;
	}

	public void setqArray(QueueT[] qArray) {
		this.qArray = qArray;
	}
	
	
	public int getTimeSimulate() {
		return timeSimulate;
	}

	public void setTimeSimulate(int timeSimulate) {
		this.timeSimulate = timeSimulate;
	}

	public void setArray(int noOfQueues) {
		qArray = new QueueT[noOfQueues];
		for(int i = 0; i < noOfQueues; i++) {
			qArray[i] = new QueueT(this.t, timeSimulate);
		}
	}

	public int getTheShortestQueue() {
		int min = qArray[0].getNoOfClients();
		int index = 0;
		for (int i = 1; i < qArray.length; i++) {
			if (min > qArray[i].getNoOfClients()) {
				min = qArray[i].getNoOfClients();
				index = i;
			}
		}
		return index;

	}
	
	public QueueT getQueue(int index) {
		return qArray[index];
	}

}
