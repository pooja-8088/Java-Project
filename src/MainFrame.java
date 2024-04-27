import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MainFrame extends JFrame{
    final private Font MainFont= new Font("Segoe print", Font.BOLD, 18);

    JLabel lbWelcome;

    JTextField tJFirstName, tJLastName;



    public void initialize(){

        JLabel firstNameLable=new JLabel("First Name");
        firstNameLable.setFont(MainFont);

        tJFirstName=new JTextField();
        tJFirstName.setFont(MainFont);

        JLabel lastNameLable=new JLabel("Last Name");
        lastNameLable.setFont(MainFont);

        tJLastName=new JTextField();
        tJLastName.setFont(MainFont);
 

        JPanel framPanel= new JPanel();
        framPanel.setLayout(new GridLayout(4,1,5,5));
        framPanel.add(firstNameLable);
        framPanel.add(tJFirstName);
        framPanel.add(lastNameLable);
        framPanel.add(tJLastName);


        lbWelcome=new JLabel();
        lbWelcome.setFont(MainFont);

        JButton okButton=new JButton("OK");
        okButton.setFont(MainFont);
        okButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                String fName=tJFirstName.getText();
                String LName=tJLastName.getText();
                lbWelcome.setText("Hello "+ fName +" " + LName);
            }
            
        });


        JButton clrButton=new JButton("Clear");
        clrButton.setFont(MainFont);
        clrButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tJFirstName.setText(" ");
                tJLastName.setText(" ");
                lbWelcome.setText(" ");
            }
            
        });


        JPanel buttoPanel=new JPanel();
        buttoPanel.setLayout(new GridLayout(1,2,5,5));
        buttoPanel.add(okButton);
        buttoPanel.add(clrButton);

        JPanel mainPanel=new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,158));
        mainPanel.add(framPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttoPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("Wel-Come");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
        MainFrame mFrame=new MainFrame();
        mFrame.initialize();
    }
    
    
}
