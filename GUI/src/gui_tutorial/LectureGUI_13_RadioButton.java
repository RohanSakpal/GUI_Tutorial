package gui_tutorial;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class LectureGUI_13_RadioButton extends JFrame implements ActionListener{
	
	JRadioButton pizzaButt;
	JRadioButton burgeRbutt;
	JRadioButton vadapav;
	
	//for img icon
	//ImageIcon pizzaIcon;
	public LectureGUI_13_RadioButton() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		//pizzaIcon = new ImageIcon("pizza.png");			for icon
		
		pizzaButt = new JRadioButton("pizza");
		burgeRbutt = new JRadioButton("burger");
		vadapav = new JRadioButton("vadapav");
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(pizzaButt);
		grp.add(burgeRbutt);
		grp.add(vadapav);
		
		pizzaButt.addActionListener(this);
		burgeRbutt.addActionListener(this);
		vadapav.addActionListener(this);
		
		//pizzaButt.setIcon(pizzaIcon);			for icon
		
		this.add(pizzaButt);
		this.add(burgeRbutt);
		this.add(vadapav);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == pizzaButt)
			System.out.println("pizza");
		else if(e.getSource() == burgeRbutt)
			System.out.println("burger");
		else
			System.out.println("vadapav");
	}
}
