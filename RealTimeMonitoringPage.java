package taruva;

import javax.swing.*;
import java.awt.*;

public class RealTimeMonitoringPage extends JFrame {
    public RealTimeMonitoringPage() {
        setTitle("Real-Time Monitoring");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        panel.add(new JLabel("🌡 Temperature:"));
        panel.add(new JLabel("26°C"));

        panel.add(new JLabel("💧 Soil Moisture:"));
        panel.add(new JLabel("45%"));

        panel.add(new JLabel("🌞 Sunlight:"));
        panel.add(new JLabel("Moderate"));

        panel.add(new JLabel("🌫 Air Quality:"));
        panel.add(new JLabel("Good"));

        add(panel);
    }
}
