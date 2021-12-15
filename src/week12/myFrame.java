package week12;

import javax.swing.*;
import java.awt.*;



public class myFrame extends JFrame {
	public myFrame() {
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("제목표시줄");

		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		this.add(button);
		setVisible(true);
		JButton button1 = new JButton("버튼1");
		button1.setPreferredSize(new Dimension(170, 90));
		this.add(button1);
		setVisible(true);
		JButton button2 = new JButton("버튼2");
		button2.setPreferredSize(new Dimension(100, 190));
		this.add(button2);
		setVisible(true);
		JButton button3 = new JButton("버튼3");
		this.add(button3);
		setVisible(true);
		JButton button4 = new JButton("버튼4");
		this.add(button4);
		setVisible(true);
	}

	public static void main(String[] args) {
		myFrame f = new myFrame();
	}
}