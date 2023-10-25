import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading=new JLabel("WelCome "+name+" to BrainQuiz");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel rules=new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setForeground(Color.BLACK);
        rules.setText(
            "<html>"+
            "<ul type='Circle'>"+
                "<li>You have to attend one question in 15sec.</li>"+
                "<li>There are 10 questions in a Quiz.</li>"+
                "<li>Each question has 10 points.</li>"+
                "<li>You can skip question by using 'Next' option</li>"+
                "<li>You can use 50:50 lifeline option only once.</li>"+
                "<li>Once you started a quiz game you are not allow to submit the quiz until 10 question are completed.</li>"+
            "</ul>"+
            "</html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.addActionListener(this);
        add(start);
        

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new BrainQuiz(name);
        }else if(ae.getSource()==back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){
        new Rules("User");

    }
}