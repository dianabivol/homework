package basics;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class masa {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon ("masa.PNG");
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
