package GeekBrains.Java.Lessons;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    // конструктор окна
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);
        // объект панель с разметкой выполненной с помощью компоновщика GridLayout
        JPanel panel = new JPanel(new GridLayout(1, 5));
        JButton [] jbuttons = new JButton[5];
        for (int i = 0; i < 5; i++){
            jbuttons[i] = new JButton("btn " + i);
            panel.add(jbuttons[i]);
        }

        ExitListener listener = new ExitListener();
        // привязка к кн.4 действия - закрытия окна с помощью вызова метода actionPerformed из класса ExitListener
        jbuttons[4].addActionListener(listener);
        // добавление панели в окно и расположение панели с помощью компоновщика BorderLayout
        add(panel, BorderLayout.NORTH);
    }

}
