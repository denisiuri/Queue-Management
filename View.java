package PT2019.Tema2.Tema2Project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class View extends JFrame {

	public static JTextArea textArea;
	private JScrollPane scrollPane;
	private JTextField minArrTextField;
	private JTextField maxArrTextField;
	private JTextField minSerTextField;
	private JTextField maxSerTextField;
	private JTextField timeTextField;
	private JTextField queuesTextField;
	private JTextField[] avgWtimeTextField = new JTextField[5];
	private JTextField[] avgSerTextField = new JTextField[5];
	private JTextField[] emptyTextField = new JTextField[5];
	private JLabel minArrLabel;
	private JLabel maxArrLabel;
	private JLabel minSerLabel;
	private JLabel queuesLabel;
	private JLabel maxSerLabel;
	private JLabel timeLabel;
	private JButton startButton;
	private JButton clearButton;
	private JLabel avgWaitingTimeLabel1;
	private JLabel avgWaitingTimeLabel2;
	private JLabel avgWaitingTimeLabel3;
	private JLabel avgWaitingTimeLabel4;
	private JLabel avgWaitingTimeLabel5;
	private JLabel avgServiceTime1;
	private JLabel avgServiceTime2;
	private JLabel avgServiceTime3;
	private JLabel avgServiceTime4;
	private JLabel avgServiceTime5;
	private JLabel emptyLabel1;
	private JLabel emptyLabel2;
	private JLabel emptyLabel3;
	private JLabel emptyLabel4;
	private JLabel emptyLabel5;
	private JPanel panel = new JPanel();
	private JProgressBar[] progressBarQueue = new JProgressBar[5];

	public static JTextArea getTextArea() {
		return textArea;
	}

	public static void setTextArea(JTextArea textArea) {
		View.textArea = textArea;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JProgressBar getProgressBarQueue(int index) {
		return progressBarQueue[index];
	}

	public void setProgressBarQueue(JProgressBar[] progressBarQueue) {
		this.progressBarQueue = progressBarQueue;
	}

	public JTextField getEmptyTextField(int index) {
		return emptyTextField[index];
	}

	public void setEmptyTextField(JTextField[] emptyTextField) {
		this.emptyTextField = emptyTextField;
	}

	public JTextField getAvgWtimeTextField(int index) {
		return avgWtimeTextField[index];
	}

	public void setAvgWtimeTextField(JTextField[] avgWtimeTextField) {
		this.avgWtimeTextField = avgWtimeTextField;
	}

	public JTextField getAvgSerTextField(int index) {
		return avgSerTextField[index];
	}

	public void setAvgSerTextField(JTextField[] avgSerTextField) {
		this.avgSerTextField = avgSerTextField;
	}

	public JTextField getMinArrTextField() {
		return minArrTextField;
	}

	public void setMinArrTextField(JTextField minArrTextField) {
		this.minArrTextField = minArrTextField;
	}

	public JTextField getMaxArrTextField() {
		return maxArrTextField;
	}

	public void setMaxArrTextField(JTextField maxArrTextField) {
		this.maxArrTextField = maxArrTextField;
	}

	public JTextField getMinSerTextField() {
		return minSerTextField;
	}

	public void setMinSerTextField(JTextField minSerTextField) {
		this.minSerTextField = minSerTextField;
	}

	public JTextField getMaxSerTextField() {
		return maxSerTextField;
	}

	public void setMaxSerTextField(JTextField maxSerTextField) {
		this.maxSerTextField = maxSerTextField;
	}

	public JTextField getTimeTextField() {
		return timeTextField;
	}

	public void setTimeTextField(JTextField timeTextField) {
		this.timeTextField = timeTextField;
	}

	public JTextField getQueuesTextField() {
		return queuesTextField;
	}

	public void setQueuesTextField(JTextField queuesTextField) {
		this.queuesTextField = queuesTextField;
	}

	public JLabel getMinArrLabel() {
		return minArrLabel;
	}

	public void setMinArrLabel(JLabel minArrLabel) {
		this.minArrLabel = minArrLabel;
	}

	public JLabel getMaxArrLabel() {
		return maxArrLabel;
	}

	public void setMaxArrLabel(JLabel maxArrLabel) {
		this.maxArrLabel = maxArrLabel;
	}

	public JLabel getMinSerLabel() {
		return minSerLabel;
	}

	public void setMinSerLabel(JLabel minSerLabel) {
		this.minSerLabel = minSerLabel;
	}

	public JLabel getQueuesLabel() {
		return queuesLabel;
	}

	public void setQueuesLabel(JLabel queuesLabel) {
		this.queuesLabel = queuesLabel;
	}

	public JLabel getMaxSerLabel() {
		return maxSerLabel;
	}

	public void setMaxSerLabel(JLabel maxSerLabel) {
		this.maxSerLabel = maxSerLabel;
	}

	public JLabel getTimeLabel() {
		return timeLabel;
	}

	public void setTimeLabel(JLabel timeLabel) {
		this.timeLabel = timeLabel;
	}

	public JButton getStartButton() {
		return startButton;
	}

	public void setStartButton(JButton startButton) {
		this.startButton = startButton;
	}

	public JButton getClearButton() {
		return clearButton;
	}

	public void setClearButton(JButton clearButton) {
		this.clearButton = clearButton;
	}

	public JLabel getAvgWaitingTimeLabel1() {
		return avgWaitingTimeLabel1;
	}

	public void setAvgWaitingTimeLabel1(JLabel avgWaitingTimeLabel1) {
		this.avgWaitingTimeLabel1 = avgWaitingTimeLabel1;
	}

	public JLabel getAvgWaitingTimeLabel2() {
		return avgWaitingTimeLabel2;
	}

	public void setAvgWaitingTimeLabel2(JLabel avgWaitingTimeLabel2) {
		this.avgWaitingTimeLabel2 = avgWaitingTimeLabel2;
	}

	public JLabel getAvgWaitingTimeLabel3() {
		return avgWaitingTimeLabel3;
	}

	public void setAvgWaitingTimeLabel3(JLabel avgWaitingTimeLabel3) {
		this.avgWaitingTimeLabel3 = avgWaitingTimeLabel3;
	}

	public JLabel getAvgWaitingTimeLabel4() {
		return avgWaitingTimeLabel4;
	}

	public void setAvgWaitingTimeLabel4(JLabel avgWaitingTimeLabel4) {
		this.avgWaitingTimeLabel4 = avgWaitingTimeLabel4;
	}

	public JLabel getAvgWaitingTimeLabel5() {
		return avgWaitingTimeLabel5;
	}

	public void setAvgWaitingTimeLabel5(JLabel avgWaitingTimeLabel5) {
		this.avgWaitingTimeLabel5 = avgWaitingTimeLabel5;
	}

	public JLabel getAvgServiceTime1() {
		return avgServiceTime1;
	}

	public void setAvgServiceTime1(JLabel avgServiceTime1) {
		this.avgServiceTime1 = avgServiceTime1;
	}

	public JLabel getAvgServiceTime2() {
		return avgServiceTime2;
	}

	public void setAvgServiceTime2(JLabel avgServiceTime2) {
		this.avgServiceTime2 = avgServiceTime2;
	}

	public JLabel getAvgServiceTime3() {
		return avgServiceTime3;
	}

	public void setAvgServiceTime3(JLabel avgServiceTime3) {
		this.avgServiceTime3 = avgServiceTime3;
	}

	public JLabel getAvgServiceTime4() {
		return avgServiceTime4;
	}

	public void setAvgServiceTime4(JLabel avgServiceTime4) {
		this.avgServiceTime4 = avgServiceTime4;
	}

	public JLabel getAvgServiceTime5() {
		return avgServiceTime5;
	}

	public void setAvgServiceTime5(JLabel avgServiceTime5) {
		this.avgServiceTime5 = avgServiceTime5;
	}

	public JLabel getEmptyLabel1() {
		return emptyLabel1;
	}

	public void setEmptyLabel1(JLabel emptyLabel1) {
		this.emptyLabel1 = emptyLabel1;
	}

	public JLabel getEmptyLabel2() {
		return emptyLabel2;
	}

	public void setEmptyLabel2(JLabel emptyLabel2) {
		this.emptyLabel2 = emptyLabel2;
	}

	public JLabel getEmptyLabel3() {
		return emptyLabel3;
	}

	public void setEmptyLabel3(JLabel emptyLabel3) {
		this.emptyLabel3 = emptyLabel3;
	}

	public JLabel getEmptyLabel4() {
		return emptyLabel4;
	}

	public void setEmptyLabel4(JLabel emptyLabel4) {
		this.emptyLabel4 = emptyLabel4;
	}

	public JLabel getEmptyLabel5() {
		return emptyLabel5;
	}

	public void setEmptyLabel5(JLabel emptyLabel5) {
		this.emptyLabel5 = emptyLabel5;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public View() {
		this.setBounds(10, 10, 1000, 784);
		this.setTitle("Shop Simulator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.setBounds(10, 10, 1000, 784);
		this.add(panel);
		panel.setLayout(null);

		scrollPane = new JScrollPane(textArea, scrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				scrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(748, 13, 209, 496);
		panel.add(scrollPane);

		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);

		minArrLabel = new JLabel("Min Arrival Time :");
		minArrLabel.setBounds(748, 522, 124, 19);
		panel.add(minArrLabel);

		minArrTextField = new JTextField();
		minArrTextField.setBounds(891, 520, 66, 22);
		panel.add(minArrTextField);

		maxArrLabel = new JLabel("Max Arrival Time:");
		maxArrLabel.setBounds(748, 558, 111, 16);
		panel.add(maxArrLabel);

		maxArrTextField = new JTextField();
		maxArrTextField.setBounds(891, 555, 66, 22);
		panel.add(maxArrTextField);

		minSerLabel = new JLabel("Min Service Time:");
		minSerLabel.setBounds(748, 593, 111, 16);
		panel.add(minSerLabel);

		minSerTextField = new JTextField();
		minSerTextField.setBounds(891, 590, 66, 22);
		panel.add(minSerTextField);

		maxSerLabel = new JLabel("Max Service Time:");
		maxSerLabel.setBounds(748, 630, 111, 16);
		panel.add(maxSerLabel);

		maxSerTextField = new JTextField();
		maxSerTextField.setBounds(891, 627, 66, 22);
		panel.add(maxSerTextField);

		timeLabel = new JLabel("Time to simulate:");
		timeLabel.setBounds(748, 665, 111, 16);
		panel.add(timeLabel);

		timeTextField = new JTextField();
		timeTextField.setBounds(891, 662, 66, 22);
		// timeTextField.setText(Integer.toString(0));
		panel.add(timeTextField);

		queuesLabel = new JLabel("No. of Queues:");
		queuesLabel.setBounds(748, 700, 111, 16);
		panel.add(queuesLabel);

		queuesTextField = new JTextField();
		queuesTextField.setBounds(891, 697, 66, 22);
		panel.add(queuesTextField);

		startButton = new JButton("Start");
		startButton.setBounds(648, 621, 76, 25);
		panel.add(startButton);

		clearButton = new JButton("Clear");
		clearButton.setBounds(648, 584, 76, 25);
		panel.add(clearButton);

		avgWaitingTimeLabel1 = new JLabel("Avg Waiting Time:");
		avgWaitingTimeLabel1.setBounds(15, 537, 111, 19);
		panel.add(avgWaitingTimeLabel1);

		avgServiceTime1 = new JLabel("Avg Service Time:");
		avgServiceTime1.setBounds(15, 593, 111, 16);
		panel.add(avgServiceTime1);

		emptyLabel1 = new JLabel("Empty Queue:");
		emptyLabel1.setBounds(15, 657, 97, 16);
		panel.add(emptyLabel1);

		avgWaitingTimeLabel2 = new JLabel("Avg Waiting Time:");
		avgWaitingTimeLabel2.setBounds(145, 537, 111, 19);
		panel.add(avgWaitingTimeLabel2);

		avgWaitingTimeLabel3 = new JLabel("Avg Waiting Time:");
		avgWaitingTimeLabel3.setBounds(275, 537, 111, 19);
		panel.add(avgWaitingTimeLabel3);

		avgWaitingTimeLabel4 = new JLabel("Avg Waiting Time:");
		avgWaitingTimeLabel4.setBounds(405, 537, 111, 19);
		panel.add(avgWaitingTimeLabel4);

		avgWaitingTimeLabel5 = new JLabel("Avg Waiting Time:");
		avgWaitingTimeLabel5.setBounds(535, 537, 111, 19);
		panel.add(avgWaitingTimeLabel5);

		avgServiceTime2 = new JLabel("Avg Service Time:");
		avgServiceTime2.setBounds(145, 593, 111, 16);
		panel.add(avgServiceTime2);

		avgServiceTime3 = new JLabel("Avg Service Time:");
		avgServiceTime3.setBounds(275, 593, 111, 16);
		panel.add(avgServiceTime3);

		avgServiceTime4 = new JLabel("Avg Service Time:");
		avgServiceTime4.setBounds(405, 593, 111, 16);
		panel.add(avgServiceTime4);

		avgServiceTime5 = new JLabel("Avg Service Time:");
		avgServiceTime5.setBounds(535, 593, 111, 16);
		panel.add(avgServiceTime5);

		int y = 0;
		for (int i = 0; i < 5; i++) {
			avgSerTextField[i] = new JTextField();
			avgSerTextField[i].setBounds(15 + y, 622, 90, 22);
			avgSerTextField[i].setEditable(false);
			panel.add(avgSerTextField[i]);

			avgWtimeTextField[i] = new JTextField();
			avgWtimeTextField[i].setBounds(15 + y, 568, 90, 22);
			avgWtimeTextField[i].setEditable(false);
			panel.add(avgWtimeTextField[i]);

			emptyTextField[i] = new JTextField();
			emptyTextField[i].setBounds(15 + y, 680, 90, 22);
			emptyTextField[i].setEditable(false);
			panel.add(emptyTextField[i]);

			progressBarQueue[i] = new JProgressBar(0, 10);
			progressBarQueue[i].setBounds(15 + y, 68, 104, 441);
			progressBarQueue[i].setValue(0);
			progressBarQueue[i].setOrientation(SwingConstants.VERTICAL);
			progressBarQueue[i].setStringPainted(true);
			panel.add(progressBarQueue[i]);
			y = y + 130;
		}

		emptyLabel2 = new JLabel("Empty Queue:");
		emptyLabel2.setBounds(145, 657, 97, 16);
		panel.add(emptyLabel2);

		emptyLabel3 = new JLabel("Empty Queue:");
		emptyLabel3.setBounds(275, 657, 97, 16);
		panel.add(emptyLabel3);

		emptyLabel4 = new JLabel("Empty Queue:");
		emptyLabel4.setBounds(405, 657, 97, 16);
		panel.add(emptyLabel4);

		emptyLabel5 = new JLabel("Empty Queue:");
		emptyLabel5.setBounds(535, 657, 97, 16);
		panel.add(emptyLabel5);

		this.setVisible(true);

	}

	void addStart(ActionListener sal) {
		startButton.addActionListener(sal);
	}

	void addClear(ActionListener cal) {
		clearButton.addActionListener(cal);
	}

}