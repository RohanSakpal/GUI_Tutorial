package gui_tutorial;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
		
public class Lecture3_Button_Frame extends JFrame implements ActionListener {
	JButton button;
	
	Lecture3_Button_Frame() {
		
		button = new JButton();
		button.setBounds(200, 100, 100, 50);
		button.addActionListener(this);
		//instead of this we use lambda exp
		//button.addActionListener(e -> System.out.println("sachin sachinnn.."));
		//if we use this than cannot implements ActionListener interface
		
		button.setText("submit");
		button.setBackground(Color.ORANGE);
		button.setForeground(Color.MAGENTA);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		this.setVisible(true);
		this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("sachin sachinnnn..");
		}
	}
}
