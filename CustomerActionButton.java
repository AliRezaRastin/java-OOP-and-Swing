import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.sql.Statement;

class CustomerActionButton 
{
		//List of variables in globel
			ImageIcon ic=null;
			ImageIcon saveim,deleteim,resetim,closeim,newim,userim,idim,contactim,addressim=null;
			JLabel lblid,lblname,lbladdress,lblcontact,back =null;
			JTextField txtid,txtname,txtaddress,txtcontact=null;
			JButton savebtn,newbtn,deletebtn,resetbtn,closebtn=null;
			JFrame frm=null;
			int idcus=0;
			String id_cus=null;
			Connection con =null;
			JOptionPane pane= null;
			
			
			String name1=null;
			PreparedStatement ps=null;
			Statement st=null;
				
			DefaultTableModel model=null;
//constractor
	CustomerActionButton()
		{
			//actions object
			Action ac=new Action();
			ActionMouse am=new ActionMouse ();
				//table
			model=new DefaultTableModel();
			JTable tbl=new JTable(model);
			JScrollPane pane=new JScrollPane (tbl,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			model.addColumn("Customer ID");
			model.addColumn("Customer Name");
			model.addColumn("Customer Address");
			model.addColumn("Customer Contact");
			tbl.setSelectionBackground( new Color(51,153,255));
			tbl.setSelectionForeground(Color.black);
			pane.setBounds(50, 20, 542, 200);
			tbl.addMouseListener(am);
			//list of labels , texrfirlds,buttons 
			idim=new ImageIcon("img/id.png");
			lblid=new JLabel("Customer ID:");
			lblid.setBounds(50,40, 120, 25);
			lblid.setIcon(idim);
			txtid=new JTextField();
			txtid.setBounds(50, 70, 200, 25);
			txtid.setEditable(false);
			
			
			
			lblname=new JLabel("Customer Name:");
			lblname.setBounds(50,100, 140, 25);
			userim=new ImageIcon("img/userName.png");
			lblname.setIcon(userim);
			txtname=new JTextField();
			txtname.setBounds(50, 130, 200, 25);
			txtname.setEditable(false);
			addressim=new ImageIcon("img/address.png");
			lbladdress=new JLabel("Customer Address:");
			lbladdress.setBounds(50, 160, 140, 25);
			lbladdress.setIcon(addressim);
			txtaddress=new JTextField();
			txtaddress.setBounds(50, 190, 200, 25);
			txtaddress.setEditable(false);
			txtcontact=new JTextField();
			contactim=new ImageIcon("img/tell.png");
			lblcontact=new JLabel("Customer Contact:");
			lblcontact.setBounds(50, 220, 140, 25);
			lblcontact.setIcon(contactim);
			txtcontact.setBounds(50, 250, 200, 25);
			txtcontact.setEditable(false);
			newim=new ImageIcon("img/new.png");
			newbtn=new JButton("New",newim);
			newbtn.setBounds(50,290, 100, 30);
			newbtn.setFocusable(false);
			newbtn.addActionListener(ac);
			saveim=new ImageIcon("img/save.png");
			savebtn=new JButton ("Save",saveim);
			savebtn.setBounds(160, 290, 100, 30);
			savebtn.setFocusable(false);
			savebtn.setEnabled(false);
			savebtn.setEnabled(false);
			savebtn.addActionListener(ac);
			
			deleteim=new ImageIcon("img/can.png");
			deletebtn=new JButton("Delete",deleteim);
			deletebtn.setBounds(270, 290, 100, 30);
			deletebtn.setFocusable(false);
			deletebtn.setEnabled(false);
			deletebtn.addActionListener(ac);
			
			
			resetim=new ImageIcon("img/reset.png");
			resetbtn=new JButton("Reset",resetim);
			resetbtn.setBounds(380, 290, 100, 30);
			resetbtn.setFocusable(false);
			resetbtn.setEnabled(false);
			resetbtn.addActionListener(ac);
			closeim=new ImageIcon("img/close.png");
			closebtn=new JButton("Close",closeim);
			closebtn.setBounds(490, 290, 100, 30);
			closebtn.setFocusable(false);
			closebtn.addActionListener(ac);
		
			ic=new ImageIcon("img/drug.png");
			back=new JLabel();
			back.setBounds(50,0,300,250);
			back.setIcon(ic);
			
			//panel
			 frm=new JFrame("Customer Details");
			JPanel pnl=new JPanel();
			JPanel pnl2=new JPanel();
			pnl.setBounds(0,320,650,250);
			pnl2.setLayout(null);
			
			pnl2.setBounds(270,10,350,265);
			pnl2.add(back);
			
		//adding into frm
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
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frm.setResizable(false);
			}
			//actions 
			class Action implements ActionListener
			{
		
				
				public void actionPerformed(ActionEvent ae)
				{
					//Connections and data
					try
					{	
					Class.forName("oracle.jdbc.driver.OracleDriver");
						 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rastin");
					}
					catch(ClassNotFoundException clexp)
					{
					pane.showMessageDialog(frm,"your database has Problem","ERROR",JOptionPane.ERROR_MESSAGE);}

					catch(SQLException exp1)
					{
						pane.showMessageDialog(frm,"your database has Problem","ERROR",JOptionPane.ERROR_MESSAGE);
					}
					
					
					
				if (con!=null)
				{
					
						
						try{
				String query2="select * from customer ";
				st=con.createStatement();
				ResultSet rs=st.executeQuery(query2);
			
				
					while(rs.next()!=false)
					{
						 String name=rs.getString(1);
						 name.toUpperCase();
						 String addrs=rs.getString(2);
						
						 String contacts=rs.getString(3);
						 
						 String phone=rs.getString(4);
						 Object []roww={name,addrs,contacts,phone};
						 model.addRow(roww);
						 
						
					}
				
				
				}
				
			
				catch(SQLException exp2)
				{
					
				}
				
				
					Object obj=ae.getSource();
					if(obj==newbtn)
					{
						
						String query1="select seq_customer.nextval from dual";
						try{
						ps = con.prepareStatement(query1);
						ResultSet re=ps.executeQuery();
						while (re.next()!=false)
					{
					  txtid.setText("cus-"+re.getInt(1));
					   idcus=re.getInt(1);
					 id_cus="CUS-"+idcus;
					}
						
						
						
						}
						catch(SQLException expe)
						{
							
						}
						savebtn.setEnabled(true);
						resetbtn.setEnabled(true);
						txtaddress.setEditable(true);
						txtcontact.setEditable(true);
						txtname.setEditable(true);
						newbtn.setEnabled(false);
					}
					if (obj==savebtn)
					{
						
						System.out.println("1");
						System.out.println("2");
						name1=txtname.getText();
						String address1=txtaddress.getText();
						String contact1=txtcontact.getText();
						
						System.out.println("3");
						
						Object[]row={ id_cus,name1,address1,contact1};
						model.addRow(row);
						
						txtname.setText("");
						txtid.setText("");
						txtcontact.setText("");
						txtaddress.setText("");
						savebtn.setEnabled(false);
						newbtn.setEnabled(true);
						
					try
					{
						System.out.println("4");
						String query="insert into customer values(?,?,?,?)";
					
						System.out.println("5");
						 ps = con.prepareStatement(query);
						ps.setString(1,id_cus);
						ps.setString(3,name1);
						ps.setString(2,address1);
						
						ps.setString(4,contact1);
					
						
						System.out.println("6");
						int result = ps.executeUpdate();
					System.out.println("7");
					
						if(result!=0)
						{
							pane.showMessageDialog(frm," your data Save successfully ","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
						}
						else
						{
							System.out.print("");
						}
							}
							
					catch(SQLException exp2)
					{
						
					}
					
					}
					if (obj==deletebtn)
					{

							int row=tbl.getSelectedRow();
							String selection=tbl.getModel().getValueAt(row,0).toString();








						int delresult=0;
						try{
						String query3="delete from customer where id = ? ";
						ps=con.prepareStatement(query3);
						ps.setString(1,id_cus.toUpperCase());
						delresult=ps.executeUpdate();
						System.out.println(delresult);
						}
						catch (SQLException expl)
						{
							System.out.println("sql Exception");
						}
						if (delresult==0)
						{
							pane.showMessageDialog(frm," your data isnt deleted successfully ","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
						}
						else
						{
							pane.showMessageDialog(frm," your data deleted  successfully ","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
						}
						
						
						
					}
					if(obj==resetbtn)
					{
						txtname.setText("");
						txtcontact.setText("");
						txtaddress.setText("");
					}
					if(obj==closebtn)
					{

						frm.dispose();
						Login lo=new Login();
					
					}
					try
					{
						
						ps.close();
						con.close();
					}
					catch(SQLException exe3)
					{
						
					}
				}
				}
			}
			class ActionMouse implements MouseListener
			{
				public void mouseClicked(MouseEvent me)
				{
					deletebtn.setEnabled(true);
				}
				public void mouseEntered(MouseEvent me1)
				{
					
				}
				public void mouseExited(MouseEvent me3)
				{
					
				}
				public void mousePressed(MouseEvent me4)
				{
					
				}
				public void mouseReleased(MouseEvent me5)
				{
					
				}
				
				
			}
			
			}