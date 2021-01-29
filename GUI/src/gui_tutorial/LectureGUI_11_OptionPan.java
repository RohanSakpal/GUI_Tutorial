package gui_tutorial;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LectureGUI_11_OptionPan {

	public static void main(String[] args) {
		
		// JOptionPane = pop up a stading dialog box that prompt
		// users for a value or inform them of somethig.
		
		//JOptionPane.showMessageDialog(null, "this is some useless info","title",
		//								JOptionPane.PLAIN_MESSAGE);
		
		//JOptionPane.showMessageDialog(null, "this is some useless info","title",
		//		JOptionPane.INFORMATION_MESSAGE);
		
		//JOptionPane.showMessageDialog(null, "Really?","title",
		//		JOptionPane.QUESTION_MESSAGE);
		
		//JOptionPane.showMessageDialog(null, "Your comp has virus!!","title",
		//		JOptionPane.WARNING_MESSAGE);
		
		//JOptionPane.showMessageDialog(null, "call tech support now or else!!","title",
		//		JOptionPane.ERROR_MESSAGE);
		
		//JOptionPane.showConfirmDialog(null,"bro do you ven code","this is my title",
		//		JOptionPane.YES_NO_CANCEL_OPTION);
		
		//String name = JOptionPane.showInputDialog("what is your name ");
		//System.out.println("hello "+name);
		
		String[] responses = {"No you are awesome!","thank you!","blush"};
		ImageIcon icon = new ImageIcon("fb.png");
		JOptionPane.showOptionDialog(null, "you are awesome", 
				"secrete mess",
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon,
				responses, 
				0);
	}

}
