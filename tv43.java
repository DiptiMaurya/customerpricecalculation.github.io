import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class tv43 extends JFrame implements ActionListener{	
	int price;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	public tv43 ()
	{
	setTitle("CHOOSE THE BRAND");
	Border border=BorderFactory.createLineBorder(Color.blue,2);
	ImageIcon i1=new ImageIcon("s43.jpg");
	ImageIcon i2=new ImageIcon("stv43.jpg");
	ImageIcon i3=new ImageIcon("lg43.jpg");
	ImageIcon i4=new ImageIcon("p43.jpg");
	l1=new JLabel("43inches SAMSUNG");
	l2=new JLabel("Rs33080");
	l3=new JLabel("43 INCHES IGO");
	l4=new JLabel("RS.34880");
	l5=new JLabel("43 INCHES LG");
	l6=new JLabel("RS.32000");
	l7=new JLabel("43, PANASONIC");
	l8=new JLabel("Rs 40550");
	b1=new JButton(i1);
	b2=new JButton(i2);
	b3=new JButton(i3);
	b4=new JButton(i4);
	setLayout(null);
	add(b1);
	add(l1);
	add(l2);
	add(b2);
	add(l3);
	add(l4);
	add(b3);
	add(l5);
	add(l6);
	add(b4);
	add(l7);
	add(l8);
	l1.setBounds(50,200,125,25);
	l2.setBounds(50,225,125,25);
	l3.setBounds(350,200,125,25);
	l4.setBounds(350,225,125,25);
	l5.setBounds(50,500,125,25);
	l6.setBounds(50,525,125,25);
	l7.setBounds(350,500,125,25);
	l8.setBounds(350,525,125,25);
	b1.setBounds(50,50,200,150);
	b2.setBounds(350,50,200,150);
	b3.setBounds(50,350,200,150);
	b4.setBounds(350,350,200,150);
	add(b1);
	add(l1);
	add(l2);
	add(b2);
	add(l3);
	add(l4);
	add(b3);
	add(l5);
	add(l6);
	add(b4);
	add(l7);
	add(l8);
	setSize(600,600);
	
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	b1.setBorder(border);
	b2.setBorder(border);
	b3.setBorder(border);
	b4.setBorder(border);
	setVisible(true);
	
	
	
}

       public void actionPerformed (ActionEvent e)
	{
		if (e.getSource()==b1)
		{	price=33080;
			new calculator(price);
		}
		if (e.getSource()==b2)
		{
			price=34880;
		 	new calculator(price);
		}
		if (e.getSource()==b3)
		{
			price=32000;
		 	new calculator(price);
		}
		if (e.getSource()==b4)
		{
			price=40550;
		 	new calculator(price);
		}

		
	}
}	


 