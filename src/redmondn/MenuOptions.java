package redmondn;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuOptions extends JFrame {
	
	public static final String newline = "\n";
	public static final String EXIT = "Exit";
	public static final String TRANSACTIONS = "Transactions";
	public static final String DEPOSIT = "Deposit";
	public static final String WITHDRAW = "Withdraw";
	public static final String FILE = "File";
	public static final String OPEN = "Open";
	public static final String SAVE = "Save";
	public static final String SAVEAS = "SaveAs";
	
	private String[] navigate = {"First", "Last", "Next", "Previous", "Find by Account Number", "Find by Surname"};
	
	
	private String[] records = {"Create", "Modify", "Delete", "Set Overdraft"};
	
	private JComboBox<String> cmbTransactions, cmbNavigate, cmbRecords, cmbFile;
	
	private JLabel lblTransactions, lblNavigate, lblRecords, lblFile, lblFirst, lblLast, lblNext, lblPrevious, lblFindByAccountNumber, lblFindBySurname;
	
	public MenuOptions() {
		cmbTransactions = new JComboBox<String>();
		cmbTransactions.addItem(MenuOptions.DEPOSIT);
		cmbTransactions.addItem(MenuOptions.WITHDRAW);
		
		cmbFile = new JComboBox<String>();
		cmbFile.addItem(MenuOptions.OPEN);
		cmbFile.addItem(MenuOptions.SAVE);
		cmbFile.addItem(MenuOptions.SAVEAS);
		
		JButton exitButton = new JButton(MenuOptions.EXIT);
		exitButton.setMnemonic(KeyEvent.VK_X);
		
		JPanel topPanel = new JPanel(new BorderLayout());

		JPanel comboBoxPanel = new JPanel();
		comboBoxPanel.setLayout(new GridLayout(3, 2));
		
		comboBoxPanel.add(lblTransactions);
		comboBoxPanel.add(cmbTransactions);
		
		comboBoxPanel.add(lblNavigate);
		comboBoxPanel.add(cmbNavigate);
		
		comboBoxPanel.add(lblRecords);
		comboBoxPanel.add(cmbRecords);
		
		comboBoxPanel.add(lblFile);
		comboBoxPanel.add(cmbFile);
		
		JPanel buttonPanel = new JPanel();

		buttonPanel.add(exitButton);
		
	}
	
	
	
	public void navigate() {
		
	}
	
	public void records() {
		
	}
	
	public void transactions() {
		
	}
	
	public void file() {
		
	}
	
	public void exitApplication() {
		
	}

}
