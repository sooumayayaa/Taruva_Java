package taruva;

import javax.swing.*;
import java.awt.*;

public class UserTypePage extends JFrame {
    public UserTypePage() {
        setTitle("Select User Type");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] types = {"Beginner", "Intermediate", "Plant Enthusiast"};
        JComboBox<String> userTypeBox = new JComboBox<>(types);
        JButton nextButton = new JButton("Next");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Select your experience level:"));
        panel.add(userTypeBox);
        panel.add(nextButton);

        nextButton.addActionListener(e -> {
            new HomePage().setVisible(true);
            dispose();
        });

        add(panel);
    }
}
