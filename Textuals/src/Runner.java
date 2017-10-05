import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.naming.ldap.ControlFactory;
import javax.sound.sampled.Control;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Runner  extends JFrame implements KeyListener, ActionListener
	{
	private static final long serialVersionUID = 1L;
	public static final Dimension WindowSize = new Dimension(450, 300);
    public static int x = 7;
    public static int y = 6;
	public Runner(String string)
		{
		super(string);
		}
	public static void main(String[] args)
		{
		Runner runner = new Runner("Cards Against Humanity");
		runner.createWindow();
		runner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screensize = new Dimension(1920, 1080);
		int x = screensize.width/2 - WindowSize.width/2;
	 	int y = screensize.height/2 - WindowSize.height/2;
	    runner.setBounds(x, y, 481, 355);
	    runner.setVisible(true);
		}
	public void createWindow()
		{
		
		}
	@Override
	public void actionPerformed(ActionEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}
	@Override
	public void keyPressed(KeyEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}
	@Override
	public void keyReleased(KeyEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}
	@Override
	public void keyTyped(KeyEvent arg0)
		{
		// TODO Auto-generated method stub
		
		}
	}
