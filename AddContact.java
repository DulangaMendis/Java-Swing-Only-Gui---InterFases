import javax.swing.*;
import java.awt.*;

class AddNewContact extends JFrame{
	
	private JButton btnAddContact;
	private JButton btnCancel;
	private JButton btnBackToHomePage; 
	
	private JTextField txConatactID;
	private JTextField txName;
	private JTextField txCNumber;
	private JTextField txCompany;
	private JTextField txSalary;
	private JTextField txBDay;
	
	
	AddNewContact(){
		setSize(700,500);
		setTitle("Add Contact");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
//------------------------Title-----------------------------------------------------//
		
		
		JPanel titlePanel=new JPanel(new GridLayout(1,0));
		JLabel titLabel=new JLabel("Add New Contact");
		titLabel.setHorizontalAlignment(JLabel.CENTER);
		titLabel.setFont(new Font("",1,30));
		titlePanel.setBackground(Color.decode("#4ecc71"));
		titlePanel.add("East",titLabel);
		add("North",titlePanel);
		
//----------------------------Lables----------------------------------------------//		
		
		
		
		JPanel labelPanel=new JPanel(new GridLayout(7,0,2,2));
		
		JLabel NLabel=new JLabel(" ");
		NLabel.setHorizontalAlignment(JLabel.CENTER);
		NLabel.setFont(new Font("",1,30));
		labelPanel.add(NLabel);
		
		JLabel lbID=new JLabel("Contact ID", SwingConstants.CENTER);
		lbID.setFont(new Font("",1,20));
		labelPanel.add(lbID);
		
		JLabel lbName=new JLabel("Name", SwingConstants.CENTER);
		lbName.setFont(new Font("",1,20));
		labelPanel.add(lbName);
		
		JLabel lbCNumber=new JLabel("Contact Number", SwingConstants.CENTER);
		lbCNumber.setFont(new Font("",1,20));
		labelPanel.add(lbCNumber);
		
		JLabel lbCompany=new JLabel("Company", SwingConstants.CENTER);
		lbCompany.setFont(new Font("",1,20));
		labelPanel.add(lbCompany);
		
		JLabel lbSalary=new JLabel("Salary", SwingConstants.CENTER);
		lbSalary.setFont(new Font("",1,20));
		labelPanel.add(lbSalary);
		
		JLabel lbBDay=new JLabel("Birth Day", SwingConstants.CENTER);
		lbBDay.setFont(new Font("",1,20));
		labelPanel.add(lbBDay);
		
		add(labelPanel);
		
	

//---------------------------TEXTFILEDS--------------------------------------------//

        JPanel textPanel=new JPanel(new GridLayout(7,0,2,2));
        
        JLabel OLabel=new JLabel(" ");
		NLabel.setHorizontalAlignment(JLabel.CENTER);
		OLabel.setFont(new Font("",1,30));
		textPanel.add(OLabel);
		
        txConatactID=new JTextField(5);
        txConatactID.setFont(new Font("",1,30));
        JPanel ConatactIDTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        ConatactIDTextPanel.add(txConatactID);
        textPanel.add(ConatactIDTextPanel);
        
        txName=new JTextField(10);
        txName.setFont(new Font("",1,25));
        JPanel NameTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        NameTextPanel.add(txName);
        textPanel.add(NameTextPanel);
        
        txCNumber=new JTextField(10);
        txCNumber.setFont(new Font("",1,25));
        JPanel CNumberTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        CNumberTextPanel.add(txCNumber);
        textPanel.add(CNumberTextPanel);
        
        txCompany=new JTextField(10);
        txCompany.setFont(new Font("",1,25));
        JPanel CompanyTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        CompanyTextPanel.add(txCompany);
        textPanel.add(CompanyTextPanel);
        
        txSalary=new JTextField(10);
        txSalary.setFont(new Font("",1,25));
        JPanel SalaryTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        SalaryTextPanel.add(txSalary);
        textPanel.add(SalaryTextPanel);
        
        txBDay=new JTextField(10);
        txBDay.setFont(new Font("",1,25));
        JPanel BDayTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        BDayTextPanel.add(txBDay);
        textPanel.add(BDayTextPanel);
        
        add("East",textPanel);
        
        
	
	
	
		
//---------------BUTTONS------------------------------------------------------------//		

		JPanel footerMain=new JPanel(new GridLayout(3,1,1,1));
		
		JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnAddContact=new JButton("Add Contact");
		btnAddContact.setFont(new Font("",1,20)); 
		buttonPanel.add(btnAddContact);
		
		btnCancel=new JButton("Cancel");
		btnCancel.setFont(new Font("",1,20)); 
		buttonPanel.add(btnCancel);
		
		footerMain.add(buttonPanel);
		
		JPanel buttonPanelBottom=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnBackToHomePage=new JButton("Back to Home Page");
		btnBackToHomePage.setFont(new Font("",1,20)); 
		buttonPanelBottom.add(btnBackToHomePage);
		footerMain.add(buttonPanelBottom);
		
		
	
		
		add("South",footerMain);
		
	}
 }



class AddContact{
	public static void main(String args[]){
		new AddNewContact().setVisible(true);;
		
	}
}

