import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.event.*;
public class home extends JFrame implements ItemListener
{
	Font f1;
	JLabel l1,l2,l3,l4,l5,l6;
	Choice c1,c2,c3;
	
	ImageIcon  i1,i2,i3;
	public home()
	{
	
	setLayout(null);
	
	
	setTitle("HOME PAGE");
	setSize(600,600);
	
	i1=new ImageIcon("tv.jpg");
	i2=new ImageIcon("f1.jpg");
	i3=new ImageIcon("ac.jpg");
	Border border=BorderFactory.createLineBorder(Color.blue,2);
	l1=new JLabel();
	l1.setIcon(i1);
	l2=new JLabel(i2);
	l3=new JLabel(i3);
	l1.setBounds(75,75,100,100);
	l2.setBounds(75,250,100,100);
	l3.setBounds(75,425,100,100);
	l4=new JLabel();
	l4.setText("<html>TELEVISION IS A MENAC<br>THAT EVERYONE LOVES  <br>TO HATE BUT CAN'T <br>SEEM TO LIVE WITHOUT</html>");
	l5=new JLabel();
	l5.setText("<html>YOU MAY BE ABLE TO<br>SPOT ARROWHEADS ON THE DESERT <br>BUT A REFRIGERATOR IS <br>A JUNGLE IN WHICH YOU<br> CAN EASILY LOST</html>");
	l6=new JLabel();
	l6.setText("<html>ARE YOU LIVING IN OVEN<br>LIKE 1950s ??? COME  <br>HERE TO BUY AMAZING  <br>ACs.WHAT ARE YOU WAITING FOR!!!</html>");
	l4.setBounds(200,75,150,100);
	l5.setBounds(200,250,150,100);
	l6.setBounds(200,425,150,100);
	l1.setBorder(border);
	l2.setBorder(border);
	l3.setBorder(border);
	l4.setBorder(border);
	l5.setBorder(border);
	l6.setBorder(border);
	
	c1=new Choice();
	c1.add("Select your choice");
	c1.add("32 inches");
	c1.add("43 inches");
	c2=new Choice();
	c2.add("Select your choice");
	c2.add("192 litres");
	c2.add("252 litres");
	c3=new Choice();
	c3.add("Select your choice");
	c3.add("1 ton");
	c3.add("1.5 ton");
	c1.setBounds(375,75,150,100);
	c2.setBounds(375,250,150,50);
	c3.setBounds(375,425,150,50);
	c1.addItemListener(this);
	c2.addItemListener(this);
	c3.addItemListener(this);
	
	
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);
	add(c1);
	add(c2);
	add(c3);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
	if(c1.getSelectedItem()=="32 inches")
	new tv32();
	if(c1.getSelectedItem()=="43 inches")
	new tv43();
	if(c2.getSelectedItem()=="192 litres")
	new f192();
	if(c2.getSelectedItem()=="252 litres")
	new f252();
	if(c3.getSelectedItem()=="1 ton")
	new ac1();
	if(c3.getSelectedItem()=="1.5 ton")
	new ac2();
		
	}


}