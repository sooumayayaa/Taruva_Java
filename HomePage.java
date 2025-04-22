package taruva;

import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {
    private JButton addPlantButton, viewPlantsButton, realTimeMonitoringButton, plantSetupButton;

    public HomePage() {
        setTitle("Taruva Dashboard");
        setSize(500, 400); // Increased window size to fit the profile box
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create main panel with GridLayout for the buttons
        JPanel mainPanel = new JPanel(new GridLayout(5, 1, 10, 10));

        addPlantButton = new JButton("Add New Plant");
        viewPlantsButton = new JButton("View Plants");
        realTimeMonitoringButton = new JButton("Real-Time Monitoring");
        plantSetupButton = new JButton("Plant Setup & Installation Flow");

        // Action listeners for each button
        addPlantButton.addActionListener(e -> new AddPlantPage().setVisible(true));
        viewPlantsButton.addActionListener(e -> new ViewPlantsPage().setVisible(true));
        realTimeMonitoringButton.addActionListener(e -> new RealTimeMonitoringPage().setVisible(true));
        plantSetupButton.addActionListener(e -> new PlantSetupPage().setVisible(true));

        mainPanel.add(addPlantButton);
        mainPanel.add(viewPlantsButton);
        mainPanel.add(realTimeMonitoringButton);
        mainPanel.add(plantSetupButton);

        // Create profile & settings box on the top-right corner
        JPanel profilePanel = new JPanel();
        JButton profileButton = new JButton("Profile & Settings");
        profileButton.addActionListener(e -> {
            new ProfilePage().setVisible(true); // Assuming you have a ProfilePage
        });
        profilePanel.add(profileButton);

        // Create a container to hold both panels
        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.add(profilePanel, BorderLayout.NORTH); // Add profile panel to the top
        containerPanel.add(mainPanel, BorderLayout.CENTER); // Add the main buttons panel

        // Add container to the frame
        add(containerPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HomePage().setVisible(true));
    }
}
