import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfName;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon I1= new ImageIcon(ClassLoader.getSystemResource("Logo.jpg"));
        JLabel image=new JLabel(I1);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading=new JLabel("Login");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        name.setForeground(new Color(30,144,254));
        add(name);

        tfName = new JTextField();
        tfName.setBounds(735,200,300,25);
        tfName.setFont(new Font("Mongolian Baiti" ,Font.BOLD,20));
        add(tfName);
       
        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200,500);
        setLocation(200,200);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name =tfName.getText();
           setVisible(false);
           new Rules(name);       
        }else if(ae.getSource() == back){
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new Login();
    }
}