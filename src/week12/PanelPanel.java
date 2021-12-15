

package week12;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelPanel extends JFrame{
	public PanelPanel() {
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("패널 연습");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("                피자를 선택하시오");
		panelA.add(label1);
		
		JButton button1 = new JButton("콤보피자");
		JButton button2 = new JButton("포테이트피자");
		JButton button3 = new JButton("불고기피자");
		panelB.add(button1); panelB.add(button2); panelB.add(button3);
		JLabel label2 = new JLabel("개수"); JTextField field1 = new JTextField(10);
		panelB.add(label2); panelB.add(field1);
		panel.add(panelA); panel.add(panelB); add(panel);
		panel.setBackground(Color.RED);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		PanelPanel p = new PanelPanel();
	}
}
