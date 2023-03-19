import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {
    
    public BorderLayoutExample() {
        // Set the title and size of the JFrame
        super("BorderLayout Example");
        setSize(400, 300);
        
        // Create a JPanel with BorderLayout
        JPanel panel = new JPanel(new BorderLayout());
        
        // Add buttons to different positions in the BorderLayout
        panel.add(new JButton("North"), BorderLayout.NORTH);
        panel.add(new JButton("South"), BorderLayout.SOUTH);
        panel.add(new JButton("East"), BorderLayout.EAST);
        panel.add(new JButton("West"), BorderLayout.WEST);
        panel.add(new JButton("Center"), BorderLayout.CENTER);
        
        // Add the panel to the JFrame
        add(panel);
        
        // Make the JFrame visible
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
