package Examples;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*; 
import java.awt.event.*; 
  
class MyFrame 
    extends JFrame 
    implements ActionListener { 
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Components of the Form 
    private Container c; 
    private JLabel title; 
    private JLabel mno; 
    private JTextField tmno; 
    private JLabel gender; 
    private JRadioButton male; 
    private JRadioButton female; 
    private ButtonGroup gengp; 
    private JLabel dob; 
    private JComboBox<?> date; 
    private JComboBox<?> month; 
    private JComboBox<?> year; 
    private JLabel add; 
    private JTextArea tadd; 
    private JCheckBox term; 
    private JButton sub; 
    private JButton reset; 
    private JTextArea tout; 
    private JLabel res;  
  
    private String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    private String months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" }; 
    private String years[] 
        = { "1995", "1996", "1997", "1998", 
            "1999", "2000", "2001", "2002", 
            "2003", "2004", "2005", "2006", 
            "2007", "2008", "2009", "2010", 
            "2011", "2012", "2013", "2014", 
            "2015", "2016", "2017", "2018", 
            "2019" };
	private JTextField tfirstname;
	private JLabel firstname;
	private JLabel lastname;
	private JTextField tlastname; 
  
    
    public MyFrame() 
    { 
        setTitle("Registration"); 
        setBounds(300, 90, 900, 650); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Registration Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        c.add(title); 
  
        firstname = new JLabel("First Name"); 
        firstname.setFont(new Font("Arial", Font.PLAIN, 20)); 
        firstname.setSize(100, 20); 
        firstname.setLocation(100, 100); 
        c.add(firstname); 
  
        tfirstname = new JTextField(); 
        tfirstname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tfirstname.setSize(190, 30); 
        tfirstname.setLocation(200, 100); 
        c.add(tfirstname); 
        
        lastname = new JLabel("Last Name"); 
        lastname.setFont(new Font("Arial", Font.PLAIN, 20)); 
        lastname.setSize(100, 20); 
        lastname.setLocation(100, 150); 
        c.add(lastname); 
  
        tlastname = new JTextField(); 
        tlastname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tlastname.setSize(190, 30); 
        tlastname.setLocation(200, 150); 
        c.add(tlastname); 
  
        mno = new JLabel("Mobile"); 
        mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
        mno.setSize(100, 20); 
        mno.setLocation(100, 200); 
        c.add(mno); 
  
        tmno = new JTextField(); 
        tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tmno.setSize(150, 30); 
        tmno.setLocation(200, 200); 
        c.add(tmno); 
  
        gender = new JLabel("Gender"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(100, 250); 
        c.add(gender); 
  
        male = new JRadioButton("Male"); 
        male.setFont(new Font("Arial", Font.PLAIN, 15)); 
        male.setSelected(true); 
        male.setSize(75, 20); 
        male.setLocation(200, 250); 
        c.add(male); 
  
        female = new JRadioButton("Female"); 
        female.setFont(new Font("Arial", Font.PLAIN, 15)); 
        female.setSelected(false); 
        female.setSize(80, 20); 
        female.setLocation(275, 250); 
        c.add(female); 
  
        gengp = new ButtonGroup(); 
        gengp.add(male); 
        gengp.add(female); 
  
        dob = new JLabel("DOB"); 
        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
        dob.setSize(100, 20); 
        dob.setLocation(100, 300); 
        c.add(dob); 
  
        date = new JComboBox<>(dates); 
        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
        date.setSize(50, 20); 
        date.setLocation(200, 300); 
        c.add(date); 
  
        month = new JComboBox<>(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(250, 300); 
        c.add(month); 
  
        year = new JComboBox<>(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(70, 20); 
        year.setLocation(320, 300); 
        c.add(year); 
  
        add = new JLabel("Address"); 
        add.setFont(new Font("Arial", Font.PLAIN, 20)); 
        add.setSize(100, 20); 
        add.setLocation(100, 350); 
        c.add(add); 
  
        tadd = new JTextArea(); 
        tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tadd.setSize(200, 75); 
        tadd.setLocation(200, 350); 
        tadd.setLineWrap(true); 
        c.add(tadd); 
  
        term = new JCheckBox("Accept Terms And Conditions."); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(250, 20); 
        term.setLocation(150, 450); 
        c.add(term); 
  
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(150, 500); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(270, 500); 
        reset.addActionListener(this); 
        c.add(reset); 
  
        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tout.setSize(300, 400); 
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        tout.setBorder(BorderFactory.createCompoundBorder(tout.getBorder(),  BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        c.add(tout); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(100, 550); 
        c.add(res); 
  
        
  
        setVisible(true); 
    } 
  
    // method actionPerformed() 
    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == sub) { 
            if (term.isSelected()) { 
            	String head="______Your Registration details______\n \n \n";
                String data1; 
                String data 
                    = "First Name : "
                      + tfirstname.getText() + "\n"+ "\n"
                      +"Last Name : "
                      + tlastname.getText() + "\n"+ "\n"
                      + "Mobile : "
                      + tmno.getText() + "\n"+ "\n"; 
                if (male.isSelected()) 
                    data1 = "Gender : Male"
                            + "\n"+ "\n"; 
                else
                    data1 = "Gender : Female"
                            + "\n"+ "\n"; 
                String data2 
                    = "DOB : "
                      + (String)date.getSelectedItem() 
                      + "/" + (String)month.getSelectedItem() 
                      + "/" + (String)year.getSelectedItem() 
                      + "\n"+ "\n"; 
  
                String data3 = "Address : " + tadd.getText(); 
                tout.setText(head+data + data1 + data2 + data3); 
                tout.setEditable(false); 
                res.setText("Registration Successful.."); 
            } 
            else { 
                tout.setText(""); 
                res.setText("Please accept the"
                            + " terms & conditions.."); 
            } 
        } 
  
        else if (e.getSource() == reset) { 
            String def = ""; 
            tfirstname.setText(def);
            tlastname.setText(def);
            tadd.setText(def); 
            tmno.setText(def); 
            res.setText(def); 
            tout.setText(def); 
            term.setSelected(false); 
            date.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0); 
        } 
    } 
} 
  
// Driver Code 
class Registration { 
  
	
    public static void main(String[] args) throws Exception 
    { 
    	try{
    		for(LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
    			if("Nimbus".equals(info.getName())){
    				UIManager.setLookAndFeel(info.getClassName());
    				break;
    			}
    		}
    	}
    	catch(Exception e){
    		}
      new MyFrame(); 
    } 
} 