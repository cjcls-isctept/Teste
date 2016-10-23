package HorseRace;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class HorseRaceGUI {
	private JFrame frame;

	public HorseRaceGUI() {
		frame = new JFrame("Horse Mega Race");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		addFrameContent();
		frame.pack();
	}

	private void addFrameContent() {

		JPanel race = new JPanel(new GridLayout(2, 1, 20, 20));
		JPanel horses = new JPanel(new GridLayout(1, 3, 20, 20));

		
		JTextArea horse1 = new JTextArea("30");
		horse1.setBorder(new EmptyBorder(5, 5, 5, 5));
		horse1.setEditable(false);
		horse1.setFont(new Font(null, 0, 20));

		
		JTextArea horse2 = new JTextArea("30");
		horse2.setBorder(new EmptyBorder(5, 5, 5, 5));
		horse2.setFont(new Font(null, 0, 20));

		
		JTextArea horse3 = new JTextArea("30");
		horse3.setBorder(new EmptyBorder(5, 5, 5, 5));
		horse3.setFont(new Font(null, 0, 20));

		
		JButton start = new JButton("START!!");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start.setEnabled(false);
				startRace(horse1, horse2, horse3);	
			}
		});

		horses.add(horse1);
		horses.add(horse2);
		horses.add(horse3);
		race.add(horses);
		race.add(start);
		frame.add(race);

	}

	public void startRace(JTextArea horse1, JTextArea horse2, JTextArea horse3){
		Horse h1 = new Horse(horse1, "Cavalo1");
		h1.start();
//		horse1.setText(h1.getValue()+"");
		
		Horse h2 = new Horse(horse2, "Cavalo2");
		h2.start();
//		horse2.setText(h2.getValue()+"");
		
		Horse h3 = new Horse(horse3, "Cavalo3");
		h3.start();
//		horse3.setText(h3.getValue()+"");
		
		
		
//		horse.setText(h1.getValue()+"");
		
	}
	
	public void open() {
		frame.setSize(300, 200);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		HorseRaceGUI gui = new HorseRaceGUI();
		gui.open();
	}
}
