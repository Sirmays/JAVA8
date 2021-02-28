import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class CalcPanel extends JPanel {
    public JTextField TxtFld;
    private BtnAction BtnPressed;

    CalcPanel(int W, int H) {
        int w = W / 5, h = H / 8, sx = w / 5, sy = h / 3;
        setLayout(null);
        setBorder(BorderFactory.createEtchedBorder());
        JTextField TxtFld = new JTextField();
        TxtFld.setHorizontalAlignment(JTextField.RIGHT);
        TxtFld.setBounds(sx, sy, 2 * sx + 3 * w, h);
        TxtFld.setEditable(false);
        add(TxtFld);

        BtnPressed = new BtnAction(TxtFld);
        String[] BtnTxt = {
                "1", "2", "3", "+", "4", "5", "6", "-",
                "7", "8", "9", "/", "0", ".", "=", "*", "SQRT"};
        for (int i = 0; i<BtnTxt.length; i++){
            addBtn(sx + (w + sx) * (i %4), (2 * sy + h) + (sy + h) * (i / 4), w, h, BtnTxt[i], BtnPressed);
        }

        JButton BtnC = new JButton("C");
        BtnC.setBounds(4 * sx + 3 * w, sy, w, h);
        BtnC.addActionListener(BtnPressed);
        BtnC.setFocusPainted(false);
        BtnC.setForeground(Color.RED);
        add(BtnC);

    }

    void addBtn(int i, int j, int w, int h, String txt,
                ActionListener AcList) {
        JButton b=new JButton(txt);
        b.setBounds(i,j,w,h);
        b.setFocusPainted(false);
        b.addActionListener(AcList);
        add(b);
    }
}
