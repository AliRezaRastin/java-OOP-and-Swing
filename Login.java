
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.StyleConstants.FontConstants;
import javax.swing.text.StyledEditorKit.BoldAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login 
{
	//List of the variables or parameters 
	
	JLabel lbl=null;
	JLabel lbl1=null;
	JLabel nameLbl,passlbl=null;
	JTextField nametxt=null;
	JPasswordField passtxt=null;
	JButton loginbtn,cancelbtn=null;
	JOptionPane pane=null;
	JLabel Logo=null;
		
	Connection con=null;
	String query,userName1,pass=null;
	PreparedStatement ps=null;
	int result=0;
	int cercle=0;
		
	JFrame frm=null;
	JLabel lbl6=null;
	ImageIcon ic=null;
	JPanel pnl6=null;
	ImageIcon ok,cancel,user,pas=null;
	ActionButton ab=new ActionButton();
//constractor
	Login()
	{
		//seting Values for labels TextFields Buttons and seting some images or icons 
		lbl1=new JLabel("Khaleqi");
		lbl1.setBounds(65, 40, 100,30 );
		lbl1.setFont(new Font("Khaleqi", Font.BOLD, 20));
		lbl1.setForeground(Color.blue);
		lbl=new JLabel("Pharmacy Management System");
		lbl.setBounds(10, 70, 300, 30);
		user=new ImageIcon("img/user.png");
		nameLbl=new JLabel("User Name :");
		nameLbl.setBounds(10,100,130,25);
		nameLbl.setIcon(user);
		nametxt=new JTextField();
		nametxt.setBounds(10, 130, 187, 25);
		pas=new ImageIcon("img/pas.png");
		passlbl=new JLabel("Password :");
		passlbl.setBounds(10,160, 130, 25);
		passlbl.setIcon(pas);
		passtxt=new JPasswordField();
		passtxt.setBounds(10, 190, 187, 25);
		ok=new ImageIcon("img/ok.png");
		loginbtn=new JButton("Login",ok);
		loginbtn.setBounds(5, 240,93, 25);
		loginbtn.setFocusable(false);
		loginbtn.addActionListener(ab);
		cancel=new ImageIcon("img/can.png");
		cancelbtn=new JButton("Close",cancel);
		cancelbtn.setBounds(105, 240, 95, 25);
		cancelbtn.setFocusable(false);
		cancelbtn.addActionListener(ab);
	
		pane=new JOptionPane();
		frm=new JFrame("Login page ");
		JPanel pnl=new JPanel();
	
		pnl.setLayout(null);
		pnl.setBounds(230,2,200,450);
		pnl6=new JPanel();
		pnl6.setBounds(1,20,400,400);

		pnl6.setLayout(null);
	
	//Background
		try
	{
		ic=new ImageIcon(getClass().getResource("/images/im.png"));
		lbl6=new JLabel(ic);
		lbl6.setLayout(null);
		lbl6.setBounds(0,2,250,300);
		pnl6.add(lbl6);	
		frm.add(pnl);
		frm.add(pnl6);
		frm.setLayout(null);
		frm.setBounds(20, 30, 450, 400);
		frm.setResizable(false);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
	
	catch(Exception e)
	{
		System.out.println(" no image ");
	}
	//adding to the panel 
		pnl.add(nameLbl);
		pnl.add(nametxt);
		pnl.add(passlbl);
		pnl.add(passtxt);
		pnl.add(lbl1);
		pnl.add(lbl);
		pnl.add(loginbtn);
		pnl.add(cancelbtn);
		
	}
//Actions
		class ActionButton implements ActionListener
		{
			
			public void actionPerformed(ActionEvent ae )
			{
				Object obj=ae.getSource();
			
				if (obj==cancelbtn)
				{
					System.exit(0);
				}
					
				if(obj==loginbtn)
				{
	
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
				pane.showMessageDialog(frm, "You are not able to connect into database", "ERROR",JOptionPane.ERROR_MESSAGE);
				}
				try {
					con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rastin");
				} catch (SQLException e)
				{
			}
				if (con!=null)
				{
					userName1=nametxt.getText();
					pass=passtxt.getText();
			query="select * from admin where userName= ?and password =?";
					System.out.println(userName1);
					System.out.println(pass);
					try {
					ps=con.prepareStatement(query);
					ps.setString(1,userName1);
					ps.setString(2,pass);
					
				} catch (SQLException e) {
					pane.showMessageDialog(frm, "sorry,You are not able to connect into database", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				try {
					 result = ps.executeUpdate();
					
					 if(result !=0)
					 {
							pane.showMessageDialog(frm, "you connected succssesfuly ", "INFORMATION ", JOptionPane.INFORMATION_MESSAGE);
							
							SecondFrame sf=new SecondFrame();
							frm.setVisible(false);
					 }	
			
					 else
					 {
						 pane.showMessageDialog(frm, "Your userName or password is wrrong ,try again","WARNING",JOptionPane.WARNING_MESSAGE);
						while(cercle<3)
						{
						 nametxt.setText("");
						passtxt.setText("");
						cercle++;
						break;
						}
						if(cercle==3)
						{
							System.exit(0);
						}	
				}}
				
				 catch (SQLException e) {
					pane.showMessageDialog(frm, "sorry,You are not able to connect into database", "ERROR", JOptionPane.ERROR_MESSAGE);

				}
				}	 
				else
				{
					pane.showMessageDialog(frm, "sorry,You are not able to connect into database", "ERROR", JOptionPane.ERROR_MESSAGE);
			}}
			}}}
