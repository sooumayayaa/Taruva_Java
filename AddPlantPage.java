package taruva;

import javax.swing.*;
import java.awt.*;

public class AddPlantPage extends JFrame {
    public AddPlantPage() {
        setTitle("Add New Plant");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        JTextField plantNameField = new JTextField();
        JTextField plantTypeField = new JTextField();
        JTextField idealLightField = new JTextField();
        JTextField idealSoilField = new JTextField();
        JButton saveButton = new JButton("Save");

        panel.add(new JLabel("Plant Name:"));
        panel.add(plantNameField);
        panel.add(new JLabel("Plant Type:"));
        panel.add(plantTypeField);
        panel.add(new JLabel("Ideal Light:"));
        panel.add(idealLightField);
        panel.add(new JLabel("Ideal Soil:"));
        panel.add(idealSoilField);
        panel.add(new JLabel());
        panel.add(saveButton);

        saveButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Plant added successfully!");
            dispose();
        });

        add(panel);
    }
}
