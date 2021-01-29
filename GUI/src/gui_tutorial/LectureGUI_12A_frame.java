package gui_tutorial;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LectureGUI_12A_frame extends JFrame implements ActionListener{
	JTextField textField;
	JButton jb;
	public LectureGUI_12A_frame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		jb = new JButton("Submit");
		jb.addActionListener(this);
	
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setEditable(true);			//if it is false than you can not edit text
		
		this.add(jb);
		this.add(textField);
		this.pack();
		this.setVisible(true);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==jb) {
			System.out.println("welcome "+textField.getText());
		}
			
	}

}
