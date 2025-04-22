package taruva;

import javax.swing.*;
import java.awt.*;

public class ProfilePage extends JFrame {
    public ProfilePage() {
        setTitle("Profile & Settings");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));

        JButton editProfileButton = new JButton("Edit Profile");
        JButton changePasswordButton = new JButton("Change Password");
        JButton languageButton = new JButton("Change Language");
        JButton logoutButton = new JButton("Logout");

        // Action listeners for profile settings
        editProfileButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Editing profile..."));
        changePasswordButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Changing password..."));
        languageButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Changing language..."));
        logoutButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Logging out..."));

        panel.add(editProfileButton);
        panel.add(changePasswordButton);
        panel.add(languageButton);
        panel.add(logoutButton);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProfilePage().setVisible(true));
    }
}
