package tuan1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InterfaceMain {
    
    public void main() {
        
        JFrame frame = new JFrame("Main");
        Panel pTop = new Panel();
        Panel pBottom = new Panel();
        Panel pMiddle = new Panel();
        JButton btnQuestion1 = new JButton("Bài 1");
        JButton btnQuestion2 = new JButton("Bài 2");
        JButton btnQuestion3 = new JButton("Bài 3");
        JButton btnQuestion4 = new JButton("Bài 4");
        JButton btnQuestion5 = new JButton("Bài 5");
        JButton btnQuestion6 = new JButton("Bài 6");
        JButton btnQuestion7 = new JButton("Bài 7");
        JButton btnQuestion8 = new JButton("Bài 8");
        JButton btnExit = new JButton("Thoát");
        Label lblText = new Label();
        
        lblText.setText("bài tập chương 0: java căn bản");
        lblText.setForeground(Color.DARK_GRAY);
        lblText.setFont(new Font("Arial",Font.BOLD,50));
        
        //frame.setSize(1280,720);
        frame.setLayout(new GridLayout(3, 1) ); 
        
        frame.add(pTop);
        frame.add(pMiddle);
        frame.add(pBottom);
        
        pTop.add(lblText);
        pMiddle.add(btnQuestion1);
        pMiddle.add(btnQuestion2);
        pMiddle.add(btnQuestion3);
        pMiddle.add(btnQuestion4);
        pMiddle.add(btnQuestion5);
        pMiddle.add(btnQuestion6);
        pMiddle.add(btnQuestion7);
        pMiddle.add(btnQuestion8);
        pBottom.add(btnExit);
        
        pMiddle.setLayout(new GridLayout(2, 4));
        pBottom.setLayout(new GridLayout(1, 1));
        
        pTop.setBackground(Color.CYAN);
        
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        btnQuestion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion1 A = new InterfaceQuestion1();
                A.main();
            }
        });
        
        btnQuestion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion2 A = new InterfaceQuestion2();
                A.main();
            }
        });
        
        btnQuestion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion3 A = new InterfaceQuestion3();
                A.main();
            }
        });
        
        btnQuestion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion4 A = new InterfaceQuestion4();
                A.main();
            }
        });
        
        btnQuestion5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion5 A = new InterfaceQuestion5();
                A.main();
            }
        });
        
        btnQuestion6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion6 A = new InterfaceQuestion6();
                A.main();
            }
        });
        
        btnQuestion7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion7 A = new InterfaceQuestion7();
                A.main();
            }
        });
        
        btnQuestion8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //frame.setVisible(false);
                //InterfaceQuestion8 A = new InterfaceQuestion8();
                //A.main();
            }
        });

        //full mang hinh
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //xoa bo cac thanh window
        //frame.setUndecorated(true);

        //tat khi su dung
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //hien thi
        frame.setVisible(true); 
        
        ///nam giua man hinh
        frame.setLocationRelativeTo(null);
    }
    
}