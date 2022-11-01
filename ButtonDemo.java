import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


class ButtonDemo extends JFrame
{
    JButton b;
    ButtonDemo()
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        ButtonDemo obj =new ButtonDemo();

        obj.setTitle("my button");
        obj.setSize(500,400);
        obj.setVisible(true);
    }
}