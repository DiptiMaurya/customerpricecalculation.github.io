 
import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
public class calculator extends JFrame 
{
	
	ImageIcon i1,i2;
	JLabel l1,l2,l3,l4;
	JButton b1;
	String qn;
	int price,q,total_price;
	JTextField t1;
	Font f1;
	public calculator(int p)
	{
	price=p;
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
	t1=new JTextField(20);
	
	f1=new Font("Arial",Font.BOLD,20);
	setFont(f1);
	setTitle("HOME PAGE");
	setSize(600,600);
	
	Border border=BorderFactory.createLineBorder(Color.blue,2);
	l2=new JLabel("PRICE PER ITEM:");
	l3=new JLabel(""+price);
	l1=new JLabel("QUANTITY:");
	i1=new ImageIcon("cal.jpg");
	l1.setBorder(border);
	l2.setBorder(border);
	l3.setBorder(border);
	l4=new JLabel(i1);

	i2=new ImageIcon("butt.jpg");
	b1=new JButton(i2);
	l4.setBounds(200,30,200,150);
	l1.setBounds(100,210,150,100);
	l2.setBounds(100,340,100,100);
	l3.setBounds(350,340,150,100);
	b1.setBounds(250,440,100,100);
	t1.setBounds(350,210,150,100);

	
	l4.setBorder(border);
	
	add(t1);
	add(l4);
	add(b1);
	add(l1);
	add(l2);
	add(l3);
	
	
	b1.addActionListener(new ActionListener ()
	{
	public void actionPerformed(ActionEvent e)
	{
		String qn=t1.getText();
		q=Integer.parseInt(qn);
		total_price=price*q;
		showMessage("CALCULATED PRICE ="+total_price);
	}});
	
	
	
	
	setVisible(true);
	
	}
	
	
	public void showMessage(String s)
	{
	JOptionPane.showMessageDialog(null,s);
	}

	
}
	