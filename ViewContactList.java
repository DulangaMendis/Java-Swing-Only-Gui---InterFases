import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
class ViewCustomerForm extends JFrame{
	private JButton btnReload;
	private JTable tblCustomerDetails;
	private DefaultTableModel dtm;
	
	ViewCustomerForm(){
		setSize(700,400);
		setTitle("View Customer Form");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel titlePanel=new JPanel(new GridLayout(1,0));
		JLabel titLabel=new JLabel("View Contact LIst");
		titLabel.setHorizontalAlignment(JLabel.CENTER);
		titLabel.setFont(new Font("",1,30));
		titlePanel.setBackground(Color.decode("#4ecc71"));
		titlePanel.add("East",titLabel);
		add("North",titlePanel);
		
	}
}

class 	ViewContactList{
	public static void main(String args[]){
		new ViewCustomerForm().setVisible(true);;
		
	}
}


		

