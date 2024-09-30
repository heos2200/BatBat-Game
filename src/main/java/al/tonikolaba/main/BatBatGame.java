package al.tonikolaba.main;

import al.tonikolaba.handlers.LoggingHelper;

import java.awt.EventQueue;
import java.util.logging.Level;

import javax.swing.JFrame;


public class BatBatGame {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				JFrame window = new JFrame("BatBat Game ™");
				window.add(new GamePanel());
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.pack();
				window.setVisible(true);
			} catch (Exception e) {
				LoggingHelper.LOGGER.log(Level.SEVERE, e.getMessage());
			}
		});
	}

}
