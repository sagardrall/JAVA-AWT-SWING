import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class ButtonDemo1 extends JFrame implements ActionListener
{
    JButton b;
    JLabel lbl;

    ButtonDemo1()
    {
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon ii = new ImageIcon("car2.gif");
        b =new JButton("click me",ii);
        b.setBackground(Color.yellow);
        b.setBackground(Color.red);
        b.setFont(new Font("Arial",Font.BOLD,30));
        Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED);
        b.setBorder(bd);
        b.setToolTipText("this is a button");
        b.setMnemonic('c');
        c.add(b);
        b.addActionListener(this);
        lbl=new JLabel();
        c.add(lbl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        ImageIcon ii=new ImageIcon("car2.gif");
        lbl.setIcon(ii);
    }
    public static void main(String args[])
    {
        ButtonDemo1 obj =new ButtonDemo1();

        obj.setTitle("my button");
        obj.setSize(500,400);
        obj.setVisible(true);
    }
}