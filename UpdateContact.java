import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
class UpdateContact extends JFrame{
	private JButton btnDeleteContact;
	private JButton btnCancel;
	private JButton btnSearchContact;
	private JButton btnHome;
	
	private JTextField searchTextPanel;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtNumber;
	private JTextField txtCompany;
	private JTextField txtSalary;
	private JTextField txtBirthday;
	
	
	UpdateContact(){
		setSize(700,400);
		setTitle("Add Customer Form");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
	//-------------------------------------Title----------------------------------------	
		
		JLabel titleLabel=new JLabel("Update Contact");
		titleLabel.setFont(new Font("",1,35)); 
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setBackground(Color.decode("#4ecc71"));
		titleLabel.setOpaque(true);
		add("North",titleLabel);
		
		
		
		
		
		JPanel searchButtonPanel=new JPanel(new GridLayout(1,2,2,2));
		
		searchTextPanel=new JTextField(20);
		searchTextPanel.setFont(new Font("",1,20)); 
		JPanel searchPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		searchPanel.add(searchTextPanel);
		searchButtonPanel.add(searchPanel);
		
		btnSearchContact=new JButton("Search");
		btnSearchContact.setFont(new Font("",1,20)); 
		JPanel btnSearchPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnSearchPanel.add(btnSearchContact);
		searchButtonPanel.add(btnSearchPanel);
		add(searchButtonPanel);
		
		
		//------------------------left label ------------------------------------------
		
		JPanel labelPanel=new JPanel(new GridLayout(6,0,2,2));
		labelPanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
		JLabel idLabel=new JLabel("ID - ");
		idLabel.setFont(new Font("",1,20)); 
		idLabel.setHorizontalAlignment(JLabel.LEFT);
		labelPanel.add(idLabel);
		
		JLabel lblName=new JLabel("Name");
		lblName.setFont(new Font("",1,20)); 
		lblName.setHorizontalAlignment(JLabel.LEFT);
		labelPanel.add(lblName);
		
		JLabel lblNumber=new JLabel("Contact Number");
		lblNumber.setFont(new Font("",1,20)); 
		lblNumber.setHorizontalAlignment(JLabel.LEFT);
		labelPanel.add(lblNumber);
		
		JLabel lblCompany=new JLabel("Company");
		lblCompany.setFont(new Font("",1,20));
		lblCompany.setHorizontalAlignment(JLabel.LEFT); 
		labelPanel.add(lblCompany);
		
		JLabel lblSalary=new JLabel("Salary");
		lblSalary.setFont(new Font("",1,20)); 
		idLabel.setHorizontalAlignment(JLabel.LEFT);
		labelPanel.add(lblSalary);
		
		JLabel lblBirthday=new JLabel("Birthday");
		lblBirthday.setFont(new Font("",1,20)); 
		lblBirthday.setHorizontalAlignment(JLabel.LEFT);
		labelPanel.add(lblBirthday);
		
		add("West",labelPanel);
		
		
		// --------------------  text panel---------------
		JPanel textPanel=new JPanel(new GridLayout(6,0,2,2));
		textPanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
		
		txtId=new JTextField(5);
		txtId.setFont(new Font("",1,20)); 
		JPanel idTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		idTextPanel.add(txtId);
		textPanel.add(idTextPanel);
		
		txtName=new JTextField(15);
		txtName.setFont(new Font("",1,20)); 
		JPanel nameTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameTextPanel.add(txtName);
		textPanel.add(nameTextPanel);
		
		txtNumber=new JTextField(15);
		txtNumber.setFont(new Font("",1,20)); 
		JPanel numberTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		numberTextPanel.add(txtNumber);
		textPanel.add(numberTextPanel);
		
		
		txtCompany=new JTextField(15);
		txtCompany.setFont(new Font("",1,20)); 
		JPanel companyTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		companyTextPanel.add(txtCompany);
		textPanel.add(companyTextPanel);
		
		txtSalary=new JTextField(10);
		txtSalary.setFont(new Font("",1,20)); 
		JPanel salaryTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		salaryTextPanel.add(txtSalary);
		textPanel.add(salaryTextPanel);
		
		txtBirthday=new JTextField(10);
		txtBirthday.setFont(new Font("",1,20)); 
		JPanel birthdayTextPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		birthdayTextPanel.add(txtBirthday);
		textPanel.add(birthdayTextPanel);
		
		
		add("East", textPanel);
		
				//---------------------footer buttons------------------------
		
		JPanel footerMain=new JPanel(new GridLayout(2,1,1,1));
		
		JPanel buttonPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnDeleteContact=new JButton("Delete");
		btnDeleteContact.setFont(new Font("",1,20)); 
		buttonPanel.add(btnDeleteContact);
		
		btnCancel=new JButton("Cancel");
		btnCancel.setFont(new Font("",1,20)); 
		buttonPanel.add(btnCancel);
		
		footerMain.add(buttonPanel);
		
		JPanel buttonPanelBottom=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnHome=new JButton("Back to Home Page");
		btnHome.setFont(new Font("",1,20)); 
		buttonPanelBottom.add(btnHome);
		footerMain.add(buttonPanelBottom);
		
		add("South",footerMain);
		
		
	}
	
	public static void main (String args[]){
			new UpdateContact().setVisible(true);
	}
}

