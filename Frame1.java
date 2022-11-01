    import java.awt.*;
    import java.awt.event.*;
    class Frame1 extends Frame implements ActionListener
    {
        Button b1,b2;
    Frame1()
    {
        b1=new Button("next");
        b2=new Button("close");
        setLayout(null);
        b1.setBounds(100,100,70,40);
        b2.setBounds(200,100,70,40);

        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            Frame2 f2 = new Frame2 ();
            f2.setSize(400,400);
            f2.setVisible(true);
        }
        else{
            System.exit(0);
        }
    }
    public static void main(String args [])
    {
        Frame f1= new Frame1();
        f1.setSize(500,500);
        f1.setTitle("first ft=rame");
        f1.setVisible(true);
    }
    }