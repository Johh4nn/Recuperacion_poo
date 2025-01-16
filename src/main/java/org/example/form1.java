package org.example;

import javax.swing.*;

public class form1 {
    private JTextField textField1;
    private JTextField textField2;
    private JButton btnIngresar;
    private JComboBox comboBox1;
    private JPanel formLogin;
    private JFrame frame;

    public void ventanaLogin(){
        frame = new JFrame("Login");
        frame.setContentPane(formLogin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }


}
