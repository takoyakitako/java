package week12;

import javax.swing.*;
import java.awt.*;


public class iconChange extends JFrame{
	public iconChange() {
		Toolkit kit = java.awt.Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300,200);
		setLocation(screenSize.width/2,screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("아이콘 변경");
		Image img = kit.getImage("candle.png");
		setIconImage(img);
		
		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		this.add(button);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		iconChange f = new iconChange();
	}
}
