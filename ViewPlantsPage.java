package taruva;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ViewPlantsPage extends JFrame {
    private JComboBox<String> plantComboBox;
    private JTextArea plantDetailsArea;
    private List<String> addedPlants;

    public ViewPlantsPage() {
        setTitle("Select Your Plant");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addedPlants = new ArrayList<>();
        // Mock data, ideally fetched from a DB
        addedPlants.add("Tulsi");
        addedPlants.add("Tomato");
        addedPlants.add("Spinach");
        addedPlants.add("Aloe Vera");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));

        JPanel selectPanel = new JPanel();
        selectPanel.setLayout(new FlowLayout());

        plantComboBox = new JComboBox<>(addedPlants.toArray(new String[0]));
        JButton viewButton = new JButton("View Details");

        selectPanel.add(new JLabel("Select Your Plant:"));
        selectPanel.add(plantComboBox);
        selectPanel.add(viewButton);

        plantDetailsArea = new JTextArea();
        plantDetailsArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(plantDetailsArea);

        panel.add(selectPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedPlant = (String) plantComboBox.getSelectedItem();
                if (selectedPlant != null) {
                    plantDetailsArea.setText("Details for: " + selectedPlant + "\n\n" +
                            "- Light: Moderate\n" +
                            "- Water: Twice a week\n" +
                            "- Soil: Well-drained\n" +
                            "- Growth Time: 2-3 months");
                }
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ViewPlantsPage().setVisible(true));
    }
}