import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class login extends JFrame
{
	public login
	{
	ImageIcon i1=new ImageIcon("calc.jpg");
	setTitle("");
	JButton b1=new JButton(i1);
	setSize(600,600);
	add(b1);
	setVisible(true);
	}
	public static void main(String args[])
	{
	login l=new login();
	}
}