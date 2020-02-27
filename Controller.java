package PT2019.Tema2.Tema2Project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends Thread {
	private View v;
	private Store s;

	public Controller(View v, Store s) {
		this.v = v;
		this.s = s;
		v.addStart(new StartListener());
		v.addClear(new ClearListener());

	}

	public Controller getController() {
		return Controller.this;
	}

	public void run() {

		try {
			while (s.getT().getSeconds() < Integer.parseInt(v.getTimeTextField().getText())) {
				for (int i = 0; i < Integer.parseInt(v.getQueuesTextField().getText()); i++) {
					v.getProgressBarQueue(i).setValue(s.getqArr().getQueue(i).getNoOfClients());
					v.getAvgSerTextField(i).setText(Float.toString(s.getqArr().getQueue(i).getAvgServiceTime()));
					v.getAvgWtimeTextField(i).setText(Float.toString(s.getqArr().getQueue(i).getAvgWaitingTime()));
					v.getEmptyTextField(i).setText(Float.toString(s.getqArr().getQueue(i).getEmptyQueueTime()));

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	class StartListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int minArr = 0;
			int maxArr = 0;
			int minSer = 0;
			int maxSer = 0;
			int noOfQueues = 0;
			int time = 0;
			try {
				minArr = Integer.parseInt(v.getMinArrTextField().getText());
				maxArr = Integer.parseInt(v.getMaxArrTextField().getText());
				minSer = Integer.parseInt(v.getMinSerTextField().getText());
				maxSer = Integer.parseInt(v.getMaxSerTextField().getText());
				noOfQueues = Integer.parseInt(v.getQueuesTextField().getText());
				time = Integer.parseInt(v.getTimeTextField().getText());
				s.getGen().setMinArrivalTime(minArr);
				s.getGen().setMaxArrivalTime(maxArr);
				s.getGen().setMinServiceTime(minSer);
				s.getGen().setMaxServiceTime(maxSer);
				s.getqArr().setTimeSimulate(time);
				s.getqArr().setArray(noOfQueues);
				s.setNoOfQueues(noOfQueues);
				s.getGen().setTimeSimulate(time);
				s.getT().setTimeSimulate(time);
				s.start();
				getController().start();

			} catch (Exception exc) {
				exc.printStackTrace();
			}

		}
	}

	class ClearListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// try {

			// }
		}
	}

}
