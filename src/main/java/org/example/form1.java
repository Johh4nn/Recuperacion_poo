package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField textField1;
    private JButton btnIngresar;
    private JComboBox comboBox1;
    private JPanel formLogin;
    private JPasswordField passwordField1;
    private JFrame frame;

    public form1() {
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textField1.getText();
                String contra = new String(passwordField1.getPassword());
                String clasifi = comboBox1.getSelectedItem().toString();

                if(clasifi.equals("Administrador")){
                    formAdministrador administrador = new formAdministrador(frame);
                    administrador.ventanaAdministrador();
                    frame.dispose();
                } else {
                    formUsuario vUsuario = new formUsuario(frame);
                    vUsuario.ventanaUsuario();

                }
            }
        });
    }

    public void ventanaLogin(){
        frame = new JFrame("Login");
        frame.setContentPane(formLogin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }


}
