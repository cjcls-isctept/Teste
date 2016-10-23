package HorseRace;

import java.util.Random;

import javax.swing.JTextArea;

public class Horse extends Thread{

	public int value=30;
	private JTextArea horse;
	public String name;
	
	public Horse(JTextArea horse , String name) {
		this.horse = horse;this.name=name;
	}

	public void run() {
		for (int i = value; i > 0; i--) {
			
			try {
				value--;
				horse.setText(value+"");
//				System.out.println(value);
				sleep((new Random()).nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
		}
		System.out.println(name+ " Cheguei ao fim!");
		
	}
	
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value=value;
	}
}
