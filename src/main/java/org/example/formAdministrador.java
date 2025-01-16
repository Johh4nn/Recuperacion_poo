package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formAdministrador {
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton registrarButton;
    private JTextField textField5;
    private JPasswordField passwordField1;
    private JComboBox comboBox1;
    private JButton registrarButton1;
    private JList list1;
    private JList list2;
    private  JFrame frame;
    private JPanel formAdminis;
    private JPanel ventAgregarProd;
    private  JFrame loginFrame;

    public formAdministrador(JFrame loginFrame){
        this.loginFrame = loginFrame;
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        registrarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void ventanaAdministrador(){
        frame = new JFrame("Administrador");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(formAdminis);
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                loginFrame.setVisible(true);
            }
        });
    }

    }


