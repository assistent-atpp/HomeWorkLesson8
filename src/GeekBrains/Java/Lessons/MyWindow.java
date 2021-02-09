package GeekBrains.Java.Lessons;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);

        JPanel panel = new JPanel(new GridLayout(1, 5));
        JButton [] jbuttons = new JButton[5];
        for (int i = 0; i < 5; i++){
            jbuttons[i] = new JButton("btn " + i);
            panel.add(jbuttons[i]);
        }
        ExitListener listener = new ExitListener();
        jbuttons[4].addActionListener(listener);
        add(panel, BorderLayout.NORTH);
    }

}
