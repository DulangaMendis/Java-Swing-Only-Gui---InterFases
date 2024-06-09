import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class ContactMainForm extends JFrame{
	private JButton btnAddCustomer;
	private JButton btnSearchCustomer;
	private JButton btnDeleteCustomer;
	private JButton btnUpdateCustomer;
	private JButton btnViewCustomer;
	private JButton btnExit;
	
	

	ContactMainForm(){
		setSize(600,400);
		setTitle("Main Form");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		//--------------------LEFT SIDE---------------------------------------------------------------//

		JPanel titlePanel=new JPanel(new GridLayout(1,0));
		JLabel titLabel=new JLabel("Home Page");
		titLabel.setHorizontalAlignment(JLabel.CENTER);
		titLabel.setFont(new Font("",1,30));
		titlePanel.setBackground(Color.decode("#4ecc71"));
		titlePanel.add("East",titLabel);
		
		
		JPanel labelPanel=new JPanel(new GridLayout(14,0));
		

		
		JLabel OLabel=new JLabel(" ");
		OLabel.setFont(new Font("",1,20));
		labelPanel.add(OLabel);
		
		JButton btnAddCustomer=new JButton("Add New Contact");
		btnAddCustomer.setFont(new Font("",1,20)); 
		labelPanel.add(btnAddCustomer);
		
		JLabel nLabel=new JLabel(" ");
		nLabel.setFont(new Font("",1,20));
		labelPanel.add(nLabel);
		

		JButton btnSearchCustomer=new JButton("Search Contact");
		btnSearchCustomer.setFont(new Font("",1,20)); 
		labelPanel.add(btnSearchCustomer);
		
		JLabel oLabel=new JLabel(" ");
		oLabel.setFont(new Font("",1,20));
		labelPanel.add(oLabel);
		
		
		JButton btnUpdateCustomer=new JButton("Update Contact");
		btnUpdateCustomer.setFont(new Font("",1,20)); 
		labelPanel.add(btnUpdateCustomer);
		
		JLabel tLabel=new JLabel(" ");
		tLabel.setFont(new Font("",1,20));
		labelPanel.add(tLabel);
		
	
		JButton btnDeleteCustomer=new JButton("Delete Contact");
		btnDeleteCustomer.setFont(new Font("",1,20)); 
		labelPanel.add(btnDeleteCustomer);
		
		JLabel hLabel=new JLabel(" ");
		hLabel.setFont(new Font("",1,20));
		labelPanel.add(hLabel);
		
		JButton btnViewCustomer=new JButton("View Contact");
		btnViewCustomer.setFont(new Font("",1,20)); 
		labelPanel.add(btnViewCustomer);
		
		JLabel iLabel=new JLabel(" ");
		iLabel.setFont(new Font("",1,20));
		labelPanel.add(iLabel);
		
		JLabel gLabel=new JLabel(" ");
		gLabel.setFont(new Font("",1,20));
		labelPanel.add(iLabel);
		
		JLabel NLabel=new JLabel(" ");
		NLabel.setFont(new Font("",1,20));
		labelPanel.add(NLabel);
		
		JButton btnExit=new JButton("Exit");
		btnExit.setFont(new Font("",1,20)); 
		labelPanel.add(btnExit);
		
		JLabel TLabel=new JLabel(" ");
		TLabel.setFont(new Font("",1,20));
		labelPanel.add(TLabel);
		
		JPanel footerPanel=new JPanel(new GridLayout(1,0));
		JLabel southLabel=new JLabel("I Friend Contact Manager");
		southLabel.setHorizontalAlignment(JLabel.CENTER);
		southLabel.setFont(new Font("",1,30));
		footerPanel.setBackground(Color.decode("#4ecc71"));
		footerPanel.add("East",southLabel);
		
		
		
		
		
		add("North",titlePanel);
		add("East",labelPanel);
		add("South",footerPanel);

		
		
		
		

		
		
		


	}
}
