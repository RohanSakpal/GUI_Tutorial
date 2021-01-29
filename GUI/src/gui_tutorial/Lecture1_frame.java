package gui_tutorial;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Lecture1_frame {

	public static void main(String[] args) {
		JFrame jf = new JFrame();								//create frame
		
		jf.setTitle("first lecture");	    					//set title
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//exit out application
			//if we use "HIDE" than frame running in background
			//if we use "DO_NOTHING" than frame does not close
		
		jf.setSize(500,500);    								//size window
		jf.setVisible(true);
		jf.setResizable(false); 								//if choose true than window resize
		
		ImageIcon img = new ImageIcon("fb.png");
		jf.setIconImage(img.getImage()); 						//set img icon
		
		jf.getContentPane().setBackground(Color.GREEN); 		//background color
			//if RGB value than "new Color(255,0,0) - red"
		
	}

}
