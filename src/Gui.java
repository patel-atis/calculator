
import java.awt.*;
import javax.swing.*;

public class Gui extends JFrame {
	public static void main(String[] args) {

		Gui gui = new Gui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(250,250);
		gui.setTitle("window");
		gui.getContentPane().setBackground(Color.cyan);

	}

}
