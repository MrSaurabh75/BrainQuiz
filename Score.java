import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener{
    

    Score(String name,int score){
        setBounds(350,100,800,650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon I1= new ImageIcon(ClassLoader.getSystemResource("score.jpg"));
        Image I2 = I1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel image=new JLabel(I3);
        image.setBounds(0,200,300,250);
        add(image);

        JLabel heading=new JLabel("Thank you "+name+" for playing Brain Quiz");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tohoma",Font.PLAIN,29));
        add(heading);

        JLabel userScore=new JLabel("Your Score is "+score);
        userScore.setBounds(350,200,300,30);
        userScore.setFont(new Font("Tohoma",Font.PLAIN,27));
        add(userScore);

        JButton submit=new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();

    }

    public static void main(String[] args){
        new Score("User",0);
    }
}
