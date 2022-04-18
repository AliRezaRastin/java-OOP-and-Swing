
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;


public class MethodsForButtons {

	
		void customerActionButton()
		{
			ImageIcon ic=null;
			ImageIcon saveim,deleteim,resetim,closeim,newim,userim,idim,contactim,addressim=null;
			JLabel lblid,lblname,lbladdress,lblcontact,back =null;
			JTextField txtid,txtname,txtaddress,txtcontact=null;
			JButton savebtn,newbtn,deletebtn,resetbtn,closebtn=null;
			DefaultTableModel model=new DefaultTableModel();
			JTable tbl=new JTable(model);
			JScrollPane pane=new JScrollPane (tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			model.addColumn("Customer ID");
			model.addColumn("Customer Name");
			model.addColumn("Customer Address");
			model.addColumn("Customer Contact");
			pane.setBounds(50, 20, 542, 200);
			
			idim=new ImageIcon("id.png");
			lblid=new JLabel("Customer ID:");
			lblid.setBounds(50,40, 120, 25);
			lblid.setIcon(idim);
			txtid=new JTextField();
			txtid.setBounds(50, 70, 200, 25);
			
			
			
			lblname=new JLabel("Customer Name:");
			lblname.setBounds(50,100, 140, 25);
			userim=new ImageIcon("userName.png");
			lblname.setIcon(userim);
			txtname=new JTextField();
			txtname.setBounds(50, 130, 200, 25);
			addressim=new ImageIcon("address.png");
			lbladdress=new JLabel("Customer Address:");
			lbladdress.setBounds(50, 160, 140, 25);
			lbladdress.setIcon(addressim);
			txtaddress=new JTextField();
			txtaddress.setBounds(50, 190, 200, 25);
			txtcontact=new JTextField();
			contactim=new ImageIcon("tell.png");
			lblcontact=new JLabel("Customer Contact:");
			lblcontact.setBounds(50, 220, 140, 25);
			lblcontact.setIcon(contactim);
			txtcontact.setBounds(50, 250, 200, 25);
			newim=new ImageIcon("new.png");
			newbtn=new JButton("New",newim);
			newbtn.setBounds(50,290, 100, 30);
			newbtn.setFocusable(false);
			saveim=new ImageIcon("save.png");
			savebtn=new JButton ("Save",saveim);
			savebtn.setBounds(160, 290, 100, 30);
			savebtn.setFocusable(false);
			
			deleteim=new ImageIcon("can.png");
			deletebtn=new JButton("Delete",deleteim);
			deletebtn.setBounds(270, 290, 100, 30);
			deletebtn.setFocusable(false);
			
			resetim=new ImageIcon("reset.png");
			resetbtn=new JButton("Reset",resetim);
			resetbtn.setBounds(380, 290, 100, 30);
			resetbtn.setFocusable(false);
			closeim=new ImageIcon("close.png");
			closebtn=new JButton("Close",closeim);
			closebtn.setBounds(490, 290, 100, 30);
			closebtn.setFocusable(false);
			ic=new ImageIcon("drug.png");
			back=new JLabel();
			back.setBounds(50,0,300,250);
			back.setIcon(ic);
			
			
			JFrame frm=new JFrame("Customer Details");
			JPanel pnl=new JPanel();
			JPanel pnl2=new JPanel();
			pnl.setBounds(0,320,650,250);
			pnl2.setLayout(null);
			
			pnl2.setBounds(270,10,350,265);
			pnl2.add(back);
			
		
			frm.setLayout(null);
			frm.setLocationRelativeTo(null);
			frm.setBounds(200, 100, 650, 600);
			frm.add(lblid);
			frm.add(pnl2);
			frm.add(txtid);
			frm.add(txtname);
			frm.add(lblname);
			frm.add(lbladdress);
			frm.add(lblcontact);
			frm.add(txtaddress);
			frm.add(txtcontact);
			frm.add(newbtn);
			frm.add(savebtn);
			frm.add(deletebtn);
			frm.add(resetbtn);
			frm.add(closebtn);
			pnl.setLayout(null);
			pnl.add(pane);
			frm.add(pnl);
			frm.setVisible(true);
			frm.setResizable(false);
			
		
		}
		
		void pharmaceuticalActionButton()
		{
			ImageIcon deleteim,userim,newim,saveim,resetim,closeim=null;
			JFrame frm=new JFrame("Pharmaceutical");
			userim=new ImageIcon("userp.png");
			JLabel lbl=new JLabel("Pharmaceutical Name: ");
			lbl.setBounds(50, 60, 160, 25);
			lbl.setIcon(userim);
			

			JTextField txt=new JTextField();
			txt.setBounds(220, 60, 370, 25);
			JPanel pnl=new JPanel();
			pnl.setBounds(10, 150, 600, 500);
			
			JButton savebtn,deletebtn,newbtn,resetbtn,closebtn=null;
	
			DefaultTableModel model=new DefaultTableModel();
			JTable tbl=new JTable(model);
			
			model.addColumn("ID");
			model.addColumn("Pharmaceutical");
			JScrollPane pane=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			pane.setBounds(40, 0, 540, 400);
			newim=new ImageIcon("newp.png");
			newbtn=new JButton("New");
			newbtn.setBounds(50,110, 100, 30);
			newbtn.setFocusable(false);
			newbtn.setIcon(newim);
			saveim=new ImageIcon("savep.png");
			savebtn=new JButton ("Save");
			savebtn.setBounds(160, 110, 100, 30);
			savebtn.setFocusable(false);
			savebtn.setIcon(saveim);
			deleteim=new ImageIcon("delete.png");
			deletebtn=new JButton("Delete");
			deletebtn.setBounds(270, 110, 100, 30);
			deletebtn.setFocusable(false);
			deletebtn.setIcon(deleteim);
			resetim=new ImageIcon("reset.png");
			resetbtn=new JButton("Reset");
			resetbtn.setBounds(380, 110, 100, 30);
			resetbtn.setFocusable(false);
			resetbtn.setIcon(resetim);
			closeim=new ImageIcon("closep.png");
			closebtn=new JButton("Close");
			closebtn.setBounds(490, 110, 100, 30);
			closebtn.setFocusable(false);
			closebtn.setIcon(closeim);
			frm.setLayout(null);
			frm.add(lbl);
			frm.add(newbtn);
			frm.add(deletebtn);
			frm.add(savebtn);
			frm.add(resetbtn);
			frm.add(closebtn);
			
			frm.add(txt);
			pnl.setLayout(null);
			pnl.add(pane);
			frm.add(pnl);
			
			frm.setLocationRelativeTo(null);
			frm.setBounds(200, 100, 650, 600);
			frm.setVisible(true);
			frm.setResizable(false);
			
			
			
		}
		
		
		void paymentActionButton()
		{
			ImageIcon ic,idim,nameim,dateim,userim,totalim,desim,amountim,newim,saveim,deleteim,resetim,cancelim=null;
			JPanel pnl=new JPanel();
			JFrame frm=new JFrame("Supplier Payment");
			frm.setBounds(200, 100, 650, 600);
			JTextField idtxt,datetxt,nametxt,totaltxt,destxt,amounttxt=null;
			JLabel back,idlbl,datelbl,namelbl,totallbl,deslbl,amountlbl=null;
			idim=new ImageIcon("idcp.png");
			idlbl=new JLabel("ID:");
			idlbl.setBounds(20, 40, 120, 25);
			idlbl.setIcon(idim);
			dateim=new ImageIcon("datecp.png");
			datelbl=new JLabel("Date:");
			datelbl.setBounds(20, 70, 120, 25);
			datelbl.setIcon(dateim);
			userim=new ImageIcon("usercp.png");
			namelbl=new JLabel("Supplier Name :");
			namelbl.setBounds(20, 100, 120, 25);
			namelbl.setIcon(userim);
			nametxt=new JTextField();
			nametxt.setBounds(160, 100,200, 25);
			totalim=new ImageIcon("totalcp.png");
			totallbl=new JLabel("Total Payable : ");
			totallbl.setBounds(20, 130, 120,25);
			totallbl.setIcon(totalim);
			totaltxt=new JTextField();
			totaltxt.setBounds(160, 130, 200,25 );
			desim=new ImageIcon("address.png");
			deslbl=new JLabel("Description :");
			deslbl.setBounds(20, 160, 120, 25);
			deslbl.setIcon(desim);
			destxt=new JTextField();
			destxt.setBounds(160, 160, 200, 25);
			amountim=new ImageIcon("amountcp.png");
			amountlbl=new JLabel("Amount :");
			amountlbl.setBounds(20, 190, 120, 25);
			amountlbl.setIcon(amountim);
			amounttxt=new JTextField();
			amounttxt.setBounds(160, 190, 200, 25);
			idtxt=new JTextField();
			idtxt.setBounds(160, 40,200, 25);
			datetxt=new JTextField();
			datetxt.setBounds(160, 70,200, 25);
			ic=new ImageIcon("payment.png");
			pnl.setLayout(null);
			pnl.setBounds(380,15,256,256);
			back=new JLabel();
			pnl.add(back);
			back.setBounds(0,0,256,256);
			back.setIcon(ic);
			
			
			JButton savebtn,deletebtn,resetbtn,newbtn,cancelbtn=null;
			newim=new ImageIcon("newcp.png");
			newbtn=new JButton ("New");
			newbtn.setBounds(10, 5,100, 30);
			newbtn.setIcon(newim);
			newbtn.setFocusable(false);
			saveim=new ImageIcon("savecp.png");
			savebtn=new JButton ("Save");
			savebtn.setBounds(132, 5, 100, 30);
			savebtn.setFocusable(false);
			savebtn.setIcon(saveim);
			deleteim=new ImageIcon("deletecp.png");
			deletebtn=new JButton("Delete");
			deletebtn.setBounds(250, 5, 100, 30);
			deletebtn.setFocusable(false);
			deletebtn.setIcon(deleteim);
			resetim=new ImageIcon("reset.png");
			resetbtn=new JButton("Reset");
			resetbtn.setBounds(360, 5, 100, 30);
			resetbtn.setFocusable(false);
			resetbtn.setIcon(resetim);
			cancelim=new ImageIcon("cancelcp.png");
			cancelbtn=new JButton("Cancel");
			cancelbtn.setBounds(480, 5, 105, 30);
			cancelbtn.setFocusable(false);
			cancelbtn.setIcon(cancelim);
			DefaultTableModel model=new DefaultTableModel();
			JTable tbl=new JTable(model);
			JScrollPane pane=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			pane.setBounds(0, 0, 600, 250);
			model.addColumn("PID");
			model.addColumn("Supplier Name");
			model.addColumn("Date");
			model.addColumn("SID");
			model.addColumn("Description");
		
			
			
			JPanel pnl1, pnl2,pnl3=null;
	
			pnl1=new JPanel();
			pnl1.add(idlbl);
			pnl1.add(deslbl);
			pnl1.add(amountlbl);
			pnl1.add(amounttxt);
			pnl1.add(destxt);
			pnl1.add(idtxt);
			pnl1.add(namelbl);
			pnl1.add(nametxt);
			pnl1.add(totallbl);
			pnl1.add(totaltxt);
			pnl1.add(datelbl);
			pnl1.add(datetxt);
			pnl1.setLayout(null);
			pnl1.setBounds(15,15 ,360 ,250);
		
			
			
			pnl3=new JPanel();
			pnl2=new JPanel();
			pnl2.setBounds(15, 270, 600, 40);
		
			pnl2.setLayout(null);
		
			pnl2.add(newbtn);
			pnl2.add(resetbtn);
			pnl2.add(deletebtn);
			pnl2.add(savebtn);
			pnl2.add(cancelbtn);
		
			pnl3.setLayout(null);
			pnl3.setBounds(15,315,600,250);
			pnl3.setLayout(null);
			
			pnl3.add(pane);
			
			
			frm.setLocationRelativeTo(null);
			frm.add(pnl1);
			frm.add(pnl3);
			frm.add(pnl2);
			frm.add(pnl);
			frm.setLayout(null);
			frm.setVisible(true);
			frm.setResizable(false);
		}
		
		
		void ReportActionButton()
		{
			DefaultTableModel model=new DefaultTableModel();
			JTable tbl=new JTable(model);
			JScrollPane pane=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			model.addColumn("Default");
			model.addColumn("Product");
			model.addColumn("Sales");
			model.addColumn("Purchase");
			model.addColumn("Customer Transaction ");
			model.addColumn("Supplier Transaction ");
			pane.setBounds(20, 70, 550, 450);

			
			JPanel pnl=new JPanel();
			pnl.setBounds(15, 15, 600, 600);
			pnl.setLayout(null);
			JTextField txt1,txt2=null;
			txt1=new JTextField();
			txt1.setBounds(80, 20, 220, 25);
			txt2=new JTextField();
			txt2.setBounds(350, 20, 220, 25);
			JLabel lbl1,lbl2=null;
			lbl1=new JLabel("From : ");
			lbl2=new JLabel("To :");
			lbl2.setBounds(320, 20, 20, 25);
			lbl1.setBounds(20, 20, 50, 25);
			pnl.add(lbl1);
			pnl.add(txt1);
			pnl.add(lbl2);
			pnl.add(txt2);
			pnl.add(pane);
			JFrame frm=new JFrame(" Report ");
			frm.setBounds(200, 100, 650, 600);
			frm.add(pnl);
			frm.setLocationRelativeTo(null);
			frm.setLayout(null);
			frm.setVisible(true);
			frm.setResizable(false);
		}
		
		void UserInformationActionButton()
		{
			
			DefaultTableModel model=new DefaultTableModel();
			JTable tbl=new JTable(model);
			JScrollPane pane=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			pane.setBounds(30, 200, 510, 340);
			model.addColumn("ID");
			model.addColumn("Full Name");
			model.addColumn("User Name");
			model.addColumn("Address");
			model.addColumn("Contact");
			model.addColumn("Registration Date");
			
			
			JTextField nametxt,addresstxt,contacttxt,usernametxt=null;
			JLabel namelbl,userlbl,contactlbl,passlbl,cpasslbl,addresslbl=null;
			JPasswordField passtxt,cpasstxt=null;
			namelbl=new JLabel("Full Name : ");
			namelbl.setBounds(30, 10, 100, 25);
			nametxt=new JTextField();
			nametxt.setBounds(30, 45, 200, 25);
			userlbl=new JLabel("User Name : ");
			userlbl.setBounds(340, 10, 100, 25);
			usernametxt=new JTextField();
			usernametxt.setBounds(340, 45, 200, 25);
			addresslbl=new JLabel("Adress : ");
			addresslbl.setBounds(30, 80, 100, 25);
			addresstxt=new JTextField();
			addresstxt.setBounds(30, 110, 200, 25);
			passlbl=new JLabel("Password :");
			passlbl.setBounds(340, 80, 80, 25);
			passtxt=new JPasswordField();
			passtxt.setBounds(340, 110, 200, 25);
			contactlbl=new JLabel("Contact : ");
			contactlbl.setBounds(30, 140, 80, 25);
			contacttxt=new JTextField();
			contacttxt.setBounds(30, 170, 200, 25);
			cpasslbl=new JLabel("Confrim Password : ");
			cpasslbl.setBounds(340, 140, 140, 25);
			cpasstxt=new JPasswordField();
			cpasstxt.setBounds(340, 170, 200, 25);
			
			
			
			
			
			JPanel pnl=new JPanel();
			pnl.setBounds(20, 20, 600, 550);
			pnl.setLayout(null);
			pnl.add(namelbl);
			pnl.add(nametxt);
			pnl.add(userlbl);
			pnl.add(usernametxt);
			pnl.add(addresslbl);
			pnl.add(addresstxt);
			pnl.add(passtxt);
			pnl.add(passlbl);
			pnl.add(contactlbl);
			pnl.add(contacttxt);
			pnl.add(cpasstxt);
			pnl.add(cpasslbl);
			pnl.add(pane);
			
			
			
			JFrame frm=new JFrame(" User Information ");
			frm.setBounds(200, 100, 650, 600);
			
			frm.add(pnl);
			frm.setLocationRelativeTo(null);
			frm.setLayout(null);
			frm.setVisible(true);
			frm.setResizable(false);
		}
		void GroupActionButton()
		{
			DefaultTableModel model=new DefaultTableModel();
			JTable tbl=new JTable(model);
			JScrollPane pane=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			model.addColumn("Group ID");
			model.addColumn("Group Name");
			pane.setBounds(30, 150, 550, 400);
			
			
			JButton savebtn,deletebtn,resetbtn,newbtn,cancelbtn=null;
			newbtn=new JButton ("New");
			newbtn.setBounds(30, 105, 80, 25);
			newbtn.setFocusable(false);
			savebtn=new JButton ("Save");
			savebtn.setBounds(155, 105, 80, 25);
			savebtn.setFocusable(false);
			deletebtn=new JButton("Delete");
			deletebtn.setBounds(265, 105, 80, 25);
			deletebtn.setFocusable(false);
			resetbtn=new JButton("Reset");
			resetbtn.setBounds(375, 105, 80, 25);
			resetbtn.setFocusable(false);
			cancelbtn=new JButton("Cancel");
			cancelbtn.setBounds(500, 105, 80, 25);
			cancelbtn.setFocusable(false);
			
			JLabel lbl=new JLabel("Group Name : ");
			lbl.setBounds(30, 50, 140, 25);
			JTextField txt =new JTextField();
			txt.setBounds(180, 50, 250, 25);
			JPanel pnl=new JPanel();
			pnl.setLayout(null);
			pnl.setBounds(10, 10, 600, 550);
			pnl.add(lbl);
			pnl.add(txt);
			pnl.add(pane);
			pnl.add(newbtn);
			pnl.add(savebtn);
			pnl.add(deletebtn);
			pnl.add(resetbtn);
			pnl.add(cancelbtn);
			JFrame frm=new JFrame(" Group ");
			frm.setBounds(200, 100, 650, 600);
			frm.add(pnl);
			frm.setLocationRelativeTo(null);
			frm.setLayout(null);
			frm.setVisible(true);
			frm.setResizable(false);	
		}
		
		void supplierActionButton()
		{
			
			
			JLabel lblid,lblname,lbladdress,lblcontact =null;
			JTextField txtid,txtname,txtaddress,txtcontact=null;
			JButton savebtn,newbtn,deletebtn,resetbtn,closebtn=null;
			DefaultTableModel model=new DefaultTableModel();
			JTable tbl=new JTable(model);
			JScrollPane pane=new JScrollPane (tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			model.addColumn("Supplier ID");
			model.addColumn("Supplier Name");
			model.addColumn("Supplier Address");
			model.addColumn("Supplier Contact");
			pane.setBounds(50, 20, 542, 200);
			
			lblid=new JLabel("Supplier ID:");
			lblid.setBounds(50,40, 120, 25);
			txtid=new JTextField();
			txtid.setBounds(50, 70, 200, 25);
			lblname=new JLabel("Supplier Name:");
			lblname.setBounds(50,100, 120, 25);
			txtname=new JTextField();
			txtname.setBounds(50, 130, 200, 25);
			lbladdress=new JLabel("Customer Address:");
			lbladdress.setBounds(50, 160, 120, 25);
			txtaddress=new JTextField();
			txtaddress.setBounds(50, 190, 200, 25);
			txtcontact=new JTextField();
			lblcontact=new JLabel("Customer Contact:");
			lblcontact.setBounds(50, 220, 120, 25);
			txtcontact.setBounds(50, 250, 200, 25);
			newbtn=new JButton("New");
			newbtn.setBounds(50,290, 100, 25);
			newbtn.setFocusable(false);
			savebtn=new JButton ("Save");
			savebtn.setBounds(160, 290, 100, 25);
			savebtn.setFocusable(false);
			deletebtn=new JButton("Delete");
			deletebtn.setBounds(270, 290, 100, 25);
			deletebtn.setFocusable(false);
			resetbtn=new JButton("Reset");
			resetbtn.setBounds(380, 290, 100, 25);
			resetbtn.setFocusable(false);
			closebtn=new JButton("Close");
			closebtn.setBounds(490, 290, 100, 25);
			closebtn.setFocusable(false);
			
			
			
			JFrame frm=new JFrame("Supplier ");
			JPanel pnl=new JPanel();
			pnl.setBounds(0,320,650,250);
			
		
			frm.setLayout(null);
			frm.setLocationRelativeTo(null);
			frm.setBounds(200, 100, 650, 600);
			frm.add(lblid);
			frm.add(txtid);
			frm.add(txtname);
			frm.add(lblname);
			frm.add(lbladdress);
			frm.add(lblcontact);
			frm.add(txtaddress);
			frm.add(txtcontact);
			frm.add(newbtn);
			frm.add(savebtn);
			frm.add(deletebtn);
			frm.add(resetbtn);
			frm.add(closebtn);
			pnl.setLayout(null);
			pnl.add(pane);
			frm.add(pnl);
			frm.setVisible(true);
			frm.setResizable(false);
		}
		
		void genericActionButton()
		{
			
			DefaultTableModel model=new DefaultTableModel();
			JTable tbl=new JTable(model);
			JScrollPane pane=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			model.addColumn("Generic ID");
			model.addColumn("Generic Name");
			pane.setBounds(30, 150, 550, 400);
			
			
			JButton savebtn,deletebtn,resetbtn,newbtn,cancelbtn=null;
			newbtn=new JButton ("New");
			newbtn.setBounds(30, 105, 80, 25);
			newbtn.setFocusable(false);
			savebtn=new JButton ("Save");
			savebtn.setBounds(155, 105, 80, 25);
			savebtn.setFocusable(false);
			deletebtn=new JButton("Delete");
			deletebtn.setBounds(265, 105, 80, 25);
			deletebtn.setFocusable(false);
			resetbtn=new JButton("Reset");
			resetbtn.setBounds(375, 105, 80, 25);
			resetbtn.setFocusable(false);
			cancelbtn=new JButton("Cancel");
			cancelbtn.setBounds(500, 105, 80, 25);
			cancelbtn.setFocusable(false);
			
			JLabel lbl=new JLabel("Generic Name : ");
			lbl.setBounds(30, 50, 140, 25);
			JTextField txt =new JTextField();
			txt.setBounds(180, 50, 250, 25);
			JPanel pnl=new JPanel();
			pnl.setLayout(null);
			pnl.setBounds(10, 10, 600, 550);
			pnl.add(lbl);
			pnl.add(txt);
			pnl.add(pane);
			pnl.add(newbtn);
			pnl.add(savebtn);
			pnl.add(deletebtn);
			pnl.add(resetbtn);
			pnl.add(cancelbtn);
			JFrame frm=new JFrame(" Generic ");
			frm.setBounds(200, 100, 650, 600);
			frm.add(pnl);
			frm.setLocationRelativeTo(null);
			frm.setLayout(null);
			frm.setVisible(true);
			frm.setResizable(false);	
		}
		
		void salesReturnActionButton()
		{
			JFrame frm=new JFrame(" Sales Return ");
			JRadioButton rb,rbDate,rbCustomer,rbProduct,pbReturn,pbCustomer=null;
			String Box1[] ={};
			JComboBox box1,box2,box3=new JComboBox();
			box1=new JComboBox();
			box1.setBounds(30, 210, 210, 25);
			rb=new JRadioButton("Daili Sales");
			rb.setBounds(30, 30, 100, 25);
			rbDate=new JRadioButton("Sales Repot , Filter By Date ");
			rbDate.setBounds(30, 90, 250, 25);
			rbCustomer=new JRadioButton("Sales Report , Filter By Customer ");
			rbCustomer.setBounds(30, 150, 250, 25);
			rbProduct=new JRadioButton("Sales Report ,Filter By Products");
			rbProduct.setBounds(30, 270, 250, 25);
			String []Box2={};
			box2=new JComboBox();
			box2.setBounds(30, 310, 210, 25);
			pbReturn=new JRadioButton("Sales Return ,Filter By Date");
			pbReturn.setBounds(300, 30, 250, 25);
			pbCustomer=new JRadioButton("Sales Return ,Filter By Customer");
			pbCustomer.setBounds(300, 90, 250, 25);
			String []Box3={};
			box3=new JComboBox();
			box3.setBounds(300, 150, 210, 25);


			
			
			JPanel pnl=new JPanel();
			pnl.setBounds(20, 20, 550, 400);
			pnl.setLayout(null);
			pnl.add(rbCustomer);
			pnl.add(rbDate);
			pnl.add(rb);
			pnl.add(box1);
			pnl.add(rbProduct);
			pnl.add(box2);
			pnl.add(pbReturn);
			pnl.add(pbCustomer);
			pnl.add(box3);
			
			frm.setBounds(200, 100, 650, 600);
			frm.add(pnl);
			frm.setLocationRelativeTo(null);
			frm.setLayout(null);
			frm.setVisible(true);
			frm.setResizable(false);
		}
	
	
	void phurchaseActionButton()
	{
		JFrame frm=new JFrame(" Purchase ");
	JButton finishbtn,sbtn,savebtn,deletebtn,resetbtn,newbtn,cancelbtn,plusbtn=null;
	
		JLabel lbl=new JLabel("ID:");
		lbl.setBounds(20,20,100,25);
		JTextField idtxt=new JTextField();
		idtxt.setBounds(20,40,180,25);
		JTextField datetxt=new JTextField();
		datetxt.setBounds(280,40,180,25);
		JLabel lbl1=new JLabel("Date:");
		lbl1.setBounds(280,20,140,25);
		JLabel lbl2=new JLabel("Supplier Name:");
		lbl2.setBounds(20,70,200,25);
		JComboBox box1=new JComboBox();
		box1.setBounds(20,90,200,25);
		JLabel lbl3=new JLabel("Product Name:");
		lbl3.setBounds(20,160,100,25);
		JComboBox box2=new JComboBox();
		box2.setBounds(20,190,200,25);
		JLabel lbl4=new JLabel("Quantity:");
		lbl4.setBounds(240,160,100,25);
		JTextField txt3=new JTextField();
		txt3.setBounds(240,190,100,25);
		JLabel lbl5=new JLabel("Unit Price");
		lbl5.setBounds(360,160,100,25);
		JTextField txt4=new JTextField();
		txt4.setBounds(360,190,100,25);
		
		
		
		
			newbtn=new JButton ("New");
			newbtn.setBounds(20, 130, 100, 25);
			newbtn.setFocusable(false);
			savebtn=new JButton ("Edit");
			savebtn.setBounds(130, 130, 100, 25);
			savebtn.setFocusable(false);
			deletebtn=new JButton("Reset");
			deletebtn.setBounds(240, 130, 100, 25);
			deletebtn.setFocusable(false);
			resetbtn=new JButton("List View");
			resetbtn.setBounds(350, 130, 100, 25);
			resetbtn.setFocusable(false);
			cancelbtn=new JButton("Close");
			cancelbtn.setBounds(460, 130, 100, 25);
			cancelbtn.setFocusable(false);
			plusbtn=new JButton("+");
			plusbtn.setBounds(480,190,60,25);
			plusbtn.setFocusable(false);
			DefaultTableModel model=new DefaultTableModel();
			JTable tbl=new JTable(model);
			JScrollPane pane=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			model.addColumn("Product Name");
			model.addColumn("Quantity");
			model.addColumn("UOM");
			model.addColumn("Unit");
			model.addColumn("Price");
			model.addColumn("Total");
			
			JLabel tot=new JLabel("Total:");
			tot.setBounds(20,440,100,25);
			JTextField tottxt=new JTextField();
			tottxt.setBounds(60,440,80,25);
			JLabel lbl6=new JLabel("Discount:");
			lbl6.setBounds(150,440,100,25);
			JTextField txt5=new JTextField();
			txt5.setBounds(210,440,80,25);
			JLabel lbl7=new JLabel("Net Amount:");
			lbl7.setBounds(300,440,100,25);
			JTextField txt6=new JTextField();
			txt6.setBounds(370,440,80,25);
			JLabel lbl8=new JLabel("Paid Amount:");
			lbl8.setBounds(455,440,100,25);
			JTextField txt7=new JTextField();
			txt7.setBounds(535,440,80,25);
			sbtn=new JButton("Save");
			sbtn.setBounds(220,480,80,25);
			sbtn.setFocusable(false);
			finishbtn=new JButton("Finish");
			finishbtn.setBounds(330,480,80,25);
			finishbtn.setFocusable(false);
			
			pane.setBounds(0, 0, 560, 200);
		
			JPanel pnl=new JPanel();
			pnl.setLayout(null);
			pnl.setBounds(20,230,560,200);
			pnl.add(pane);
		
			frm.setBounds(200, 100, 650, 600);
			frm.add(idtxt);
			frm.add(tot);
			frm.add(txt7);
			frm.add(pnl);
			frm.add(tottxt);
			frm.add(finishbtn);
			frm.add(lbl4);
			frm.add(txt6);
			frm.add(lbl7);
			frm.add(sbtn);
			frm.add(lbl5);
			frm.add(lbl8);
			frm.add(txt3);
			frm.add(txt5);
			frm.add(box2);
			frm.add(lbl6);
			frm.add(lbl3);
			frm.add(txt4);
			frm.add(resetbtn);
			frm.add(cancelbtn);
			frm.add(deletebtn);
			frm.add(newbtn);
			frm.add(plusbtn);
			frm.add(savebtn);
			frm.add(lbl1);
			frm.add(datetxt);
			frm.add(lbl);
			frm.add(lbl2);
			frm.add(box1);
			frm.setLocationRelativeTo(null);
			frm.setLayout(null);
			frm.setVisible(true);
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			frm.setResizable(false);
		
	}
	void products()
	{
			JFrame frm=new JFrame(" Product ");
			frm.setBounds(200, 100, 650, 600);
			JLabel lbl=new JLabel("Parameters:");
			lbl.setBounds(40,40,100,25);
			String []names={"Product Id","Group id","Gnaric id","Product Name","Stock Quantity","Pharmacutical id"};
			JComboBox box=new JComboBox(names);
			box.setBounds(40,60,140,25);
			DefaultTableModel model=new DefaultTableModel();
			JTable tbl=new JTable(model);
			JScrollPane pane=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			model.addColumn("Id");
			model.addColumn("Pharma id ");
			model.addColumn("Group id");
			model.addColumn("Group Name");
			model.addColumn("Gnaric id");
			model.addColumn("Gnaric Name");
			model.addColumn("Product name");
			model.addColumn("Rock");
			model.addColumn("Price");
			model.addColumn("Tax");
			model.addColumn("Amount");
			pane.setBounds(0, 0, 600, 350);
			JPanel pnl=new JPanel();
			pnl.setLayout(null);
			pnl.setBounds(20,200,700,400);
			pnl.add(pane);
			
			frm.add(pnl);
			frm.add(box);
			frm.add(lbl);
			frm.setLocationRelativeTo(null);
			frm.setLayout(null);
			frm.setVisible(true);
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			frm.setResizable(false);
		
	}
	void filter()
	{
			JPanel pnl1,pnl2=null;
			JButton vi1btn,print=null;
			JRadioButton rbCustomer,rbSupplier,allp,fpharma,fgroup,fbg=null;
			JComboBox fpbox,fgbox,fbgbox=null;
			JFrame frm=new JFrame("Filter");
			frm.setBounds(200, 100, 650, 600);
			pnl1=new JPanel();
			pnl1.setLayout(null);
			rbCustomer=new JRadioButton("Customer List ");
			rbCustomer.setBounds(20,20,140,25);
			rbSupplier=new JRadioButton("Supplier List");
			rbSupplier.setBounds(20,60,140,25);
			vi1btn=new JButton("Print View");
			vi1btn.setBounds(40,100,110,25);
			
			pnl1.add(vi1btn);
			pnl1.add(rbSupplier);
			pnl1.add(rbCustomer);
			
			allp=new JRadioButton("All Product");
			allp.setBounds(20,20,140,25);
			fpharma=new JRadioButton("Filter by Pharmacutical");
			fpharma.setBounds(20,60,180,25);
			fpbox=new JComboBox();
			fpbox.setBounds(30,100,150,25);
			fgroup=new JRadioButton("Filter by Group");
			fgroup.setBounds(220,60,160,25);
			fgbox=new JComboBox();
			fgbox.setBounds(220,100,150,25);
			fbg=new JRadioButton("Filter By Gnaric");
			fbg.setBounds(400,60,180,25);
			fbgbox=new JComboBox();
			fbgbox.setBounds(400,100,150,25);
			print=new JButton("Print View");
			print.setBounds(430,240,110,25);
			
			pnl2=new JPanel();
			pnl2.setLayout(null);
			pnl2.add(fpharma);
			pnl2.add(allp);
			pnl2.add(fpbox);
			pnl2.add(fgroup);
			pnl2.add(fgbox);
			pnl2.add(fbg);
			pnl2.add(fbgbox);
			pnl2.add(print);
		
			JTabbedPane pt=new JTabbedPane();
			pt.setBounds(20,20,600,300);
			pt.add("Default",pnl1);
			pt.add("Product",pnl2);
			
			frm.add(pt);
			frm.setLocationRelativeTo(null);
			frm.setLayout(null);
			frm.setVisible(true);
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			frm.setResizable(false);
	}
	void changePassword()
	{
		JFrame frm=new JFrame("changePassword");
		JPanel pnl=null;
		JButton changebtn,closebtn=null;
		JLabel user,oldpass,newpass,confirm=null;
		JTextField usertxt=null;
		JPasswordField old,newpasstxt,conpass=null;
		
		
		user=new JLabel("User Name:");
		user.setBounds(20,40,100,25);
		oldpass=new JLabel("Old Password:");
		oldpass.setBounds(20,100,120,25);
		newpass=new JLabel("New Password:");
		newpass.setBounds(250,40,120,25);
		confirm=new JLabel("Confirm:");
		confirm.setBounds(250,100,120,25);
		
		
		
		old=new JPasswordField();
		old.setBounds(20,130,150,25);
		newpasstxt=new JPasswordField();
		newpasstxt.setBounds(250,70,150,25);
		conpass=new JPasswordField();
		conpass.setBounds(250,130,150,25);
		
		usertxt=new JTextField();
		usertxt.setBounds(20,70,150,25);
		
		changebtn=new JButton("Change");
		changebtn.setBounds(100,180,100,25);
		changebtn.setFocusable(false);
		closebtn=new JButton("Close");
		closebtn.setBounds(220,180,100,25);
		closebtn.setFocusable(false);
		
		pnl=new JPanel();
		pnl.setBounds(10,10,600,400);
		pnl.setLayout(null);
		pnl.add(user);
		pnl.add(usertxt);
		pnl.add(oldpass);
		pnl.add(old);
		pnl.add(newpass);
		pnl.add(newpasstxt);
		pnl.add(confirm);
		pnl.add(conpass);
		pnl.add(changebtn);
		pnl.add(closebtn);
		
		
		
		
		frm.setBounds(200, 100, 480, 300);
		frm.setLocationRelativeTo(null);
		frm.setLayout(null);
		frm.add(pnl);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setResizable(false);
	}
	void productInfo()
	{
	JButton newbtn,savebtn,deletebtn,resetbtn,cancelbtn=null;
	JLabel id,name,pharma,group,gnaric,rock,stock,cost,expir,tax,unit,price=null;
	JTextField idtxt,nametxt,pharmatxt,gnarictxt,grouptxt,rocktxt,stocktxt,costtxt,expirtxt,taxtxt,unitxt,pricetxt=null;
	
	JFrame frm=new JFrame("Product Information");
	frm.setBounds(200, 100, 600, 600);
	JPanel pnl=new JPanel();
	pnl.setLayout(null);
	pnl.setBounds(20,20,560,600);
	
	id=new JLabel("Id:");
	id.setBounds(10,10,100,25);
	name=new JLabel("Product Name:");
	name.setBounds(10,70,120,25);
	pharma=new JLabel("Pharmaceutical:");
	pharma.setBounds(10,130,120,25); 
	group=new JLabel("Group:");
	group.setBounds(10,180,120,25); 
	gnaric=new JLabel("Generic:");
	gnaric.setBounds(10,235,120,25);
	rock=new JLabel("Rock:");
	rock.setBounds(185,10,120,25); 	
	stock=new JLabel("Stock Quntity:");
	stock.setBounds(185,70,140,25); 
	cost=new JLabel("Cost (Unit):");
	cost.setBounds(185,130,140,25); 
	expir=new JLabel("Expiration Date:");
	expir.setBounds(185,180,140,25); 
	tax=new JLabel("Tax:");
	tax.setBounds(185,235,140,25);
	unit=new JLabel("Unit Of Measure:");
	unit.setBounds(360,10,120,25); 
	price=new JLabel("Sales Prices(Unit):");
	price.setBounds(360,70,140,25); 
	
	idtxt=new JTextField();
	idtxt.setBounds(10,40,150,25);
	nametxt=new JTextField();
	nametxt.setBounds(10,100,150,25);
	pharmatxt=new JTextField();
	pharmatxt.setBounds(10,155,150,25);
	grouptxt=new JTextField();
	grouptxt.setBounds(10,205,150,25);
	gnarictxt=new JTextField();
	gnarictxt.setBounds(10,260,150,25);
	rocktxt=new JTextField();
	rocktxt.setBounds(185,40,150,25);
	stocktxt=new JTextField();
	stocktxt.setBounds(185,100,150,25);
	costtxt=new JTextField();
	costtxt.setBounds(185,155,150,25);
	expirtxt=new JTextField();
	expirtxt.setBounds(185,205,150,25);
	taxtxt=new JTextField();
	taxtxt.setBounds(185,260,150,25);
	unitxt=new JTextField();
	unitxt.setBounds(360,40,150,25);
	pricetxt=new JTextField();
	pricetxt.setBounds(360,100,150,25);
	
			newbtn=new JButton ("New");
			newbtn.setBounds(10, 300, 100, 25);
			newbtn.setFocusable(false);
			savebtn=new JButton ("Save");
			savebtn.setBounds(120, 300, 100, 25);
			savebtn.setFocusable(false);
			deletebtn=new JButton("Delete");
			deletebtn.setBounds(230, 300, 100, 25);
			deletebtn.setFocusable(false);
			resetbtn=new JButton("Reset");
			resetbtn.setBounds(340, 300, 100, 25);
			resetbtn.setFocusable(false);
			cancelbtn=new JButton("Close");
			cancelbtn.setBounds(450, 300, 100, 25);
			cancelbtn.setFocusable(false);

	pnl.add(id);
	pnl.add(idtxt);
	pnl.add(name);
	pnl.add(nametxt);
	pnl.add(pharma);
	pnl.add(pharmatxt);
	pnl.add(group);
	pnl.add(grouptxt);
	pnl.add(gnaric);
	pnl.add(gnarictxt);
	pnl.add(rock);
	pnl.add(rocktxt);
	pnl.add(stock);
	pnl.add(stocktxt);
	pnl.add(cost);
	pnl.add(costtxt);
	pnl.add(expir);
	pnl.add(expirtxt);
	pnl.add(tax);
	pnl.add(taxtxt);
	pnl.add(unit);
	pnl.add(unitxt);
	pnl.add(price);
	pnl.add(pricetxt);
	pnl.add(newbtn);
	pnl.add(savebtn);
	pnl.add(deletebtn);
	pnl.add(resetbtn);
	pnl.add(cancelbtn);
	DefaultTableModel model=new DefaultTableModel();
	JTable tbl=new JTable(model);
		JScrollPane pane=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		pane.setBounds(5,330,550,200);
		model.addColumn("id");
		model.addColumn("PName");
		model.addColumn("Pharmacutical");
		model.addColumn("Group");
		model.addColumn("Generic");
		model.addColumn("Rock");
		model.addColumn("Cost");
		model.addColumn("Date");
		model.addColumn("Tax");
		model.addColumn("Unit");
		model.addColumn("Price");
		
		pnl.add(pane);
		
	
	

	frm.setLocationRelativeTo(null);
	frm.setLayout(null);
	frm.add(pnl);
	
	frm.setVisible(true);
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frm.setResizable(false);	
	}
		void IDontKnow()
		{
			JFrame frm=new JFrame("");
			frm.setBounds(200, 100, 610, 600);
			JPanel pnl=new JPanel();
			JTextField nettxt,sdatetxt,ttaxtxt,ctxt,inotxt,totalftxt,gtotaltxt,balancetxt,paymenttxt=null;
			JButton newbtn,holdbtn,printbtn,paymentbtn,blistbtn,deletebtn,p1,n1=null;
			
			JLabel cname,time,balance,ttax,sdate,net,date,total,ino,totalf,gtotal,payment=null;
			cname=new JLabel("Casher Name:");
			cname.setBounds(2,2,100,20);
			time=new JLabel("Time:");
			time.setBounds(200,2,100,20);
			date=new JLabel("Date:");
			date.setBounds(300,2,100,20);
			total=new JLabel("Total");
			total.setForeground(Color.blue);
			total.setBounds(175,25,100,25);
			
			ctxt=new JTextField();
			ctxt.setBounds(100,2,100,25);
			DefaultTableModel model=new DefaultTableModel();
			JTable tbl=new JTable(model);
			JScrollPane pane=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			pane.setBounds(10,50,350,350);
			model.addColumn("PName");
			model.addColumn("Qty");
			model.addColumn("Unit");
			model.addColumn("Price");
			model.addColumn("Tax");
			model.addColumn("Total");
			ino=new JLabel("Invoice No:");
			ino.setBounds(10,410,100,25);
			totalf=new JLabel("Total:");
			totalf.setBounds(90,410,100,25);
			gtotal=new JLabel("Grand Total:");
			gtotal.setBounds(170,410,101,25);
			payment=new JLabel("Payment:");
			payment.setBounds(255,410,100,25);
			sdate=new JLabel("Sales Date:");
			sdate.setBounds(10,470,100,25);
			ttax=new JLabel("Total Tax:");
			ttax.setBounds(90,470,100,25);
			net=new JLabel("Net Amount:");
			net.setBounds(170,470,100,25);
			balance=new JLabel("Balance:");
			balance.setBounds(255,470,100,25);
			
			
			inotxt=new JTextField();
			inotxt.setBounds(10,440,70,25);
			totalftxt=new JTextField();
			totalftxt.setBounds(90,440,70,25);
			gtotaltxt=new JTextField();
			gtotaltxt.setBounds(170,440,70,25);
			paymenttxt=new JTextField();
			paymenttxt.setBounds(250,440,70,25);
			sdatetxt=new JTextField();
			sdatetxt.setBounds(10,500,70,25);
			ttaxtxt=new JTextField();
			ttaxtxt.setBounds(90,500,70,25);
			nettxt=new JTextField();
			nettxt.setBounds(170,500,70,25);
			balancetxt=new JTextField();
			balancetxt.setBounds(250,500,70,25);
			
			newbtn=new JButton ("New");
			newbtn.setBounds(330, 450, 100, 25);
			newbtn.setFocusable(false);
			holdbtn=new JButton ("Hold");
			holdbtn.setBounds(440, 450, 100, 25);
			holdbtn.setFocusable(false);
			printbtn=new JButton ("Print");
			printbtn.setBounds(330, 480, 100, 25);
			printbtn.setFocusable(false);
			paymentbtn=new JButton ("Payment");
			paymentbtn.setBounds(440, 480, 100, 25);
			paymentbtn.setFocusable(false);
			blistbtn=new JButton ("Payment");
			blistbtn.setBounds(380, 510, 100, 25);
			blistbtn.setFocusable(false);
			deletebtn=new JButton ("Delete");
			deletebtn.setBounds(370, 370, 100, 25);
			deletebtn.setFocusable(false);
			p1=new JButton ("+1");
			p1.setBounds(480, 370, 50, 25);
			p1.setFocusable(false);
			n1=new JButton ("-1");
			n1.setBounds(540, 370, 50, 25);
			n1.setFocusable(false);
			
			
			
			
			pnl.setLayout(null);
			pnl.setBounds(2,2,600,600);
			pnl.add(cname);
			pnl.add(ctxt);
			pnl.add(time);
			pnl.add(date);
			pnl.add(total);
			pnl.add(pane);
			pnl.add(ino);
			pnl.add(totalf);
			pnl.add(gtotal);
			pnl.add(payment);
			pnl.add(inotxt);
			pnl.add(totalftxt);
			pnl.add(gtotaltxt);
			pnl.add(paymenttxt);
			pnl.add(sdate);
			pnl.add(sdatetxt);
			pnl.add(ttaxtxt);
			pnl.add(ttax);
			pnl.add(net);
			pnl.add(nettxt);
			pnl.add(balance);
			pnl.add(balancetxt);
			pnl.add(newbtn);
			pnl.add(holdbtn);
			pnl.add(printbtn);
			pnl.add(paymentbtn);
			pnl.add(blistbtn);
			pnl.add(deletebtn);
			pnl.add(p1);
			pnl.add(n1);
			
	
			frm.add(pnl);
			frm.setLocationRelativeTo(null);
			frm.setLayout(null);
			frm.setVisible(true);
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frm.setResizable(false);
		}

}
