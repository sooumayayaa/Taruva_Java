package taruva;

import javax.swing.*;
import java.awt.*;

public class SplashScreen extends JFrame {
    public SplashScreen() {
        JLabel label = new JLabel("Grow what you trust.", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 26));
        add(label);

        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Timer timer = new Timer(2000, e -> {
            new LoginPage().setVisible(true);
            dispose();
        });
        timer.setRepeats(false);
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SplashScreen().setVisible(true));
    }
}