import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorFrame extends JFrame {
    CalculatorFrame() {
        int w = 470, h = 670;
        setTitle("My Calculator");
        setBounds(100, 100, w, h);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        CalcPanel panel = new CalcPanel(w,h);
        add(panel);
        setResizable(false);
        setVisible(true);
    }

}
