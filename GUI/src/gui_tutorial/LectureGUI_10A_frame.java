package gui_tutorial;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class LectureGUI_10A_frame extends JFrame implements ActionListener {
	JButton jb;
	JCheckBox box ;
	public LectureGUI_10A_frame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		jb = new JButton();
		jb.setText("Submit");
		jb.addActionListener(this);
		
		box = new JCheckBox();
		box.setText("i am not robot");
		box.setFocusable(false);
		box.setFont(new Font("Consolas",Font.PLAIN,35));
		
		this.add(jb);
		this.add(box);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == jb)
		{
			System.out.println(box.isSelected());
		}
	}
}
