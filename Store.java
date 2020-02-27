package PT2019.Tema2.Tema2Project;
public class Store extends Thread {
	private TimerThread t;
	private QueuesManager qArr;
	private ClientGenerator gen;
	private float avgServiceTime[] = new float[5];
	private float avgWaitingTime[] = new float[5];
	private int emptyTime[] = new int[5];
	private int noOfQueues;

	
	public int getEmptyTime(int index) {
		return emptyTime[index];
	}

	public void setEmptyTime(int[] emptyTime) {
		this.emptyTime = emptyTime;
	}

	public float getAvgWaitingTime(int index) {
		return avgWaitingTime[index];
	}

	public void setAvgWaitingTime(float[] avgWaitingTime) {
		this.avgWaitingTime = avgWaitingTime;
	}

	public float getAvgServiceTime(int index) {
		return avgServiceTime[index];
	}

	public void setAvgServiceTime(float avgServiceTime, int index) {
		this.avgServiceTime[index] = avgServiceTime;
	}

	public int getNoOfQueues() {
		return noOfQueues;
	}

	public void setNoOfQueues(int noOfQueues) {
		this.noOfQueues = noOfQueues;
	}

	public TimerThread getT() {
		return t;
	}

	public void setT(TimerThread t) {
		this.t = t;
	}

	public QueuesManager getqArr() {
		return qArr;
	}

	public void setqArr(QueuesManager qArr) {
		this.qArr = qArr;
	}

	public ClientGenerator getGen() {
		return gen;
	}

	public void setGen(ClientGenerator gen) {
		this.gen = gen;
	}

	public Store() {
		this.t = new TimerThread();
		this.qArr = new QueuesManager(t);
		this.gen = new ClientGenerator(t, qArr);
	}

	public Store(TimerThread t, QueuesManager q, ClientGenerator g) {
		this.t = t;
		this.qArr = q;
		this.gen = g;
	}

	public void run() {
		t.start();
		gen.start();
		for (int i = 0; i < noOfQueues; i++) {
			qArr.getQueue(i).start();
		}
	}

}
