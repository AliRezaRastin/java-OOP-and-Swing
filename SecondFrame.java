

import java.awt.Color;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class SecondFrame {

	
	JFrame frm=null;
	JButton reception,customerbtn,supplierbtn,pharmaceuticalbtn,groupbtn,genericbtn,productsbtn,userInfobtn,changePasswordbtn,companyDetailsbtn=null;
	JButton salesReturnbtn,customerPaymentbtn,customerRefundbtn,purchasesbtn,suplierPaymentbtn,supplierRefundbtn,incomebtn,reportbtn=null;
	JPanel pnl,pnlDown,pnlRight,pnlUp =null;
	JMenu file , help ,window =null;
	JMenuBar bar=null;
	JMenuItem item=null;
	MethodsForButtons mb=new MethodsForButtons();
	ImageIcon back=null;
	JLabel lbl=null;
	SecondFrame()
	
	{
		Buttons btnAction=new Buttons();
		// Making all the buttons and set them into panel 
		customerbtn=new JButton("Customer");
		customerbtn.setBounds(30,90, 140, 25);
		customerbtn.addActionListener(btnAction);
		customerbtn.setFocusable(false);
		supplierbtn=new JButton("Supplier");
		supplierbtn.setBounds(30,130, 140, 25);
		supplierbtn.addActionListener(btnAction);
		supplierbtn.setFocusable(false);
		pharmaceuticalbtn=new JButton("Pharmaceutical");
		pharmaceuticalbtn.setBounds(30,170, 140, 25);
		pharmaceuticalbtn.addActionListener(btnAction);
		pharmaceuticalbtn.setFocusable(false);
		groupbtn=new JButton("Group");
		groupbtn.setBounds(30,210, 140, 25);
		groupbtn.addActionListener(btnAction);
		groupbtn.setFocusable(false);
		genericbtn=new JButton("Generic");
		genericbtn.setBounds(30,250, 140, 25);
		genericbtn.addActionListener(btnAction);
		genericbtn.setFocusable(false);
		productsbtn=new JButton("Products");
		productsbtn.setBounds(30,290, 140, 25);
		productsbtn.addActionListener(btnAction);
		productsbtn.setFocusable(false);
		userInfobtn=new JButton("User Info");
		userInfobtn.setBounds(30,330, 140, 25);
		userInfobtn.addActionListener(btnAction);
		userInfobtn.setFocusable(false);
		changePasswordbtn=new JButton("Change Password");
		changePasswordbtn.setBounds(30,370, 140, 25);
		changePasswordbtn.addActionListener(btnAction);
		changePasswordbtn.setFocusable(false);
		companyDetailsbtn=new JButton("Company Details");
		companyDetailsbtn.setBounds(30,410, 140, 25);
		companyDetailsbtn.addActionListener(btnAction);
		companyDetailsbtn.setFocusable(false);
		reception=new JButton("Reception Complex");
		reception.setBounds(30,410, 145, 25);
		reception.addActionListener(btnAction);
		reception.setFocusable(false);
		
		
		//making all the buttons into RigthPanel
		
		salesReturnbtn=new JButton("Sales Return");
		salesReturnbtn.setBounds(30, 90, 145, 25);
		salesReturnbtn.addActionListener(btnAction);
		salesReturnbtn.setFocusable(false);
		customerPaymentbtn=new JButton("Customer Payment");
		customerPaymentbtn.setBounds(30, 130, 145, 25);
		customerPaymentbtn.addActionListener(btnAction);
		customerPaymentbtn.setFocusable(false);
		customerRefundbtn=new JButton("CustomerRefund");
		customerRefundbtn.setBounds(30, 170, 145, 25);
		customerRefundbtn.addActionListener(btnAction);
		customerRefundbtn.setFocusable(false);
		purchasesbtn=new JButton("purchases");
		purchasesbtn.setBounds(30, 210, 145, 25);
		purchasesbtn.addActionListener(btnAction);
		purchasesbtn.setFocusable(false);
		suplierPaymentbtn=new JButton("Suplier Payment");
		suplierPaymentbtn.setBounds(30, 250, 145, 25);
		suplierPaymentbtn.addActionListener(btnAction);
		suplierPaymentbtn.setFocusable(false);
		supplierRefundbtn=new JButton("SupplierRefund");
		supplierRefundbtn.setBounds(30, 290, 145, 25);
		supplierRefundbtn.addActionListener(btnAction);
		supplierRefundbtn.setFocusable(false);
		incomebtn=new JButton("Income");
		incomebtn.setBounds(30, 330, 145, 25);
		incomebtn.addActionListener(btnAction);
		incomebtn.setFocusable(false);
		reportbtn=new JButton("Report");
		reportbtn.setBounds(30, 370, 145, 25);
		reportbtn.addActionListener(btnAction);
		reportbtn.setFocusable(false);
		//LeftPanel 
		pnl=new JPanel();
		pnl.setLayout(null);
		pnl.setBounds(2, 30, 180, 600);
		pnl.setBackground(Color.LIGHT_GRAY);
		//DownPanel
		pnlDown=new JPanel();
		pnlDown.setLayout(null);
		pnlDown.setBackground(Color.CYAN);
		pnlDown.setBounds(2, 630, 900,40 );
		
		
		//RightPanel 
		pnlRight=new JPanel();
		pnlRight.setBackground(Color.LIGHT_GRAY);
		pnlRight.setLayout(null);
		pnlRight.setBounds(712, 30, 180, 600);
		//Menu
		bar=new JMenuBar();
		file=new JMenu("File");
		help=new JMenu("Help");
		window=new JMenu("Window");
		bar.add(file);
		bar.add(window);
		bar.add(help);
		
		//up panel
		pnlUp=new JPanel();
		pnlUp.setLayout(null);
		
		pnlUp.setBounds(2, 0, 900, 30);
		pnlUp.add(bar);
		bar.setBounds(2, 3, 900, 25);
		pnlUp.setBackground(Color.white);
		
		
		
		//add all the buttons into Left Panel
		pnl.add(customerbtn);
		pnl.add(supplierbtn);
		pnl.add(pharmaceuticalbtn);
		pnl.add(groupbtn);
		pnl.add(genericbtn);
		pnl.add(productsbtn);
		pnl.add(userInfobtn);
		pnl.add(changePasswordbtn);
		pnl.add(companyDetailsbtn);
		
		//add all the buttons into Right Panel
		pnlRight.add(salesReturnbtn);
		pnlRight.add(customerPaymentbtn);
		pnlRight.add(customerRefundbtn);
		pnlRight.add(purchasesbtn);
		pnlRight.add(suplierPaymentbtn);
		pnlRight.add(supplierRefundbtn);
		pnlRight.add(incomebtn);
		pnlRight.add(reportbtn);
		pnlRight.add(reception);
		//frame 
		back=new ImageIcon("back.jpg");
		frm=new JFrame("Main page");
		lbl=new JLabel(back);
		lbl.setBounds(180,30,550,600);
		frm.add(lbl);
		frm.add(pnl);
		frm.add(pnlDown);
		frm.add(pnlRight);
		frm.add(pnlUp);
		frm.setBounds(50, 60, 900, 700);
		frm.setLocationRelativeTo(null);
		frm.setLayout(null);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setResizable(false);
	

	}
	class Buttons implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			Object obj=ae.getSource();
			if (obj==customerbtn)
			{
				mb.customerActionButton();
			}
			if (obj==supplierbtn)
			{
				mb.supplierActionButton();
			}
			if (obj==pharmaceuticalbtn)
			{
				mb.pharmaceuticalActionButton();
			}
			if (obj==groupbtn)
			{
				mb.GroupActionButton();
			}
			if (obj==genericbtn)
			{
				mb.genericActionButton();
			}
			if (obj==productsbtn)
			{
				
			}
			if (obj==userInfobtn)
			{
				mb.UserInformationActionButton();
			}
			if (obj==changePasswordbtn)
			{
				
			}
			if (obj==companyDetailsbtn)
			{
				
			}
			if (obj==salesReturnbtn)
			{
				mb.salesReturnActionButton();
			}
			if (obj==customerPaymentbtn)
			{
				
			}
			if (obj==customerRefundbtn)
			{
				
			}
			if (obj==purchasesbtn)
			{
			mb.phurchaseActionButton();
			}
			if (obj==suplierPaymentbtn)
			{
				mb.paymentActionButton();
			}
			if (obj==supplierRefundbtn)
			{
				
			}
			if (obj==incomebtn)
			{
				
			}	if (obj==reportbtn)
			{
				mb.ReportActionButton();
			}
			
			
		}
		
		}


}
