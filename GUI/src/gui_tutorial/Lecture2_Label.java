package gui_tutorial;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Lecture2_Label {

	public static void main(String[] args) {
		
		ImageIcon img = new ImageIcon("fb.png");
		Border border = BorderFactory.createLineBorder(Color.GREEN,3);
		
		JLabel jl = new JLabel();
		jl.setText("my name is rohan"); 					//set text
		jl.setIcon(img); 									//set icon
		
		jl.setHorizontalTextPosition(JLabel.CENTER);		//text center,right,left of image
		jl.setVerticalTextPosition(JLabel.TOP);				//text top and bottom of img
		
		jl.setForeground(new Color(0x00FF00)); 				//set color
		jl.setFont(new Font("MV Boli",Font.BOLD,20)); 		//set font
		
		jl.setIconTextGap(50);
		jl.setBackground(Color.yellow);
		jl.setOpaque(true);
		
		jl.setBorder(border);
		jl.setVerticalAlignment(JLabel.CENTER); 			//set vertical position of icon+text
		jl.setHorizontalAlignment(JLabel.CENTER);
		
		//jl.setBBounds(0,0,250,250); - (x,y,width,height) 	//size and dimension element
		
		JFrame jf = new JFrame();
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.add(jl);
	}

}
