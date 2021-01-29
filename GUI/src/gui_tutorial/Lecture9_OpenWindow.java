package gui_tutorial;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

public class Lecture9_OpenWindow {

	public static void main(String[] args) {
		
		LaunchPage launchPage = new LaunchPage();
	}

}

class LaunchPage implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Window");
	
	public LaunchPage() {
		
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.add(myButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == myButton) {
			//frame.dispose() -> only one window open
			NewWindow myWindoe = new NewWindow();
		}
	}
}

class NewWindow {
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Rohan Sakpal");
	
	NewWindow() {
		label.setBounds(0, 0, 100,100);
		label.setFont(new Font(null, Font.PLAIN,25));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
	}
}
