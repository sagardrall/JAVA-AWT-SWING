import java.awt.*;
import java.awt.event.*;
class Mylist extends Frame implements ItemListener
{
    int[]msg;
    List lst;
    Mylist()
    {
        setLayout(new FlowLayout());

        lst= new List(4,true);

        lst.add("ENGLISH");
        lst.add("HINDI");
        lst.add("SANSKRIT");
        lst.add("TELUGU");
        lst.add("FRENCH");
        add(lst);
        lst.addItemListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("selected languages: ",100,200);
        msg =lst.getSelectedIndexes();
        for(int i=0; i<msg.length; i++)
        {

            String item=lst.getItem(msg[i]);
            g.drawString(item, 100,220+i*20);
        }
    }
    public static void main(String args[])
    {
        Mylist m1=new Mylist();
        m1.setTitle("my list box");
        m1.setSize(400,400);
        m1.setVisible(true);
    }
}