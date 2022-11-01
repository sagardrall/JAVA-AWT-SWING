import java.awt.*;
import java.awt.event.*;
class Frame2 extends Frame implements ActionListener
{
    Button b;
Frame2()
{
    setLayout(new FlowLayout());
    b=new Button("Back");
    add(b);
    b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
    this.dispose();
}
}