package taruva;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.Desktop;

public class PlantSetupPage extends JFrame {

    public PlantSetupPage() {
        setTitle("Plant Setup & Installation Flow");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        JButton basicKitButton = new JButton("Basic Kit");
        JButton standardKitButton = new JButton("Standard Kit");
        JButton premiumKitButton = new JButton("Premium Kit");

        basicKitButton.addActionListener(e -> {
            openImage("C:\\Users\\kanik\\Pictures\\Screenshots\\Screenshot 2025-04-14 032936.png");
        });

        standardKitButton.addActionListener(e -> {
            openImage("C:\\Users\\kanik\\Pictures\\Screenshots\\Screenshot 2025-04-14 033223.png");
        });

        premiumKitButton.addActionListener(e -> {
            openImage("C:\\Users\\kanik\\Pictures\\Screenshots\\Screenshot 2025-04-14 033410.png");
        });

        panel.add(basicKitButton);
        panel.add(standardKitButton);
        panel.add(premiumKitButton);

        add(panel);
    }

    private void openImage(String filePath) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                File imageFile = new File(filePath);
                if (imageFile.exists()) {
                    desktop.open(imageFile);
                } else {
                    JOptionPane.showMessageDialog(this, "Image file not found at: " + filePath);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Desktop is not supported on this system.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error opening the image: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PlantSetupPage().setVisible(true));
    }
}
