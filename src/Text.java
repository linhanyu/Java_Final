import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;

/**
 * Created by Henry on 16/6/1.
 */
public class Text {


    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setLayout(new GridLayout());
        jf.setSize(1000,500);

        JPanel jp = new JPanel(new FlowLayout());

        JLabel text= new JLabel();
        text.setFont(new Font("微软雅黑",Font.BOLD,72));
//        text.setPreferredSize(new Dimension(100,100));
//        text.setBackground(Color.BLACK);
        text.setText("想要女朋友");

        Time_in_Flusher t = new Time_in_Flusher(text);

        JButton violate = new JButton();
        violate.setText("效果一");
        violate.addActionListener(new Violate_Monitor(text,t));
        jp.add(violate);

        JButton Gradually = new JButton();
        Gradually.setText("效果二");
        Gradually.addActionListener(new Gradually_Monitor(text,t));
        jp.add(Gradually);

        jf.add(jp,BorderLayout.SOUTH);
        jf.add(text,BorderLayout.CENTER);
//        jf.setBackground(Color.BLACK);

        jf.setVisible(true);

        t.start();

    }


}

